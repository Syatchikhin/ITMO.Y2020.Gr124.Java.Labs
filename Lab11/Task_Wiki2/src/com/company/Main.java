package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;
import java.net.MalformedURLException;
import java.net.URL;

interface DownloadListener{
    void onError();
    void onDownload();
    void threadOnRunnnable(Thread.State a, long b);
}

class Listener implements DownloadListener{

    @Override
    public void onError(){System.out.println("Error flow execution");}

    @Override
    public void onDownload(){System.out.println("Error flow execution");}

    @Override
    public void threadOnRunnable(Thread.State a, long b){
        System.out.println("Flow "+ b +"in operation, state: "+ a);
    }
}

class MyThread extends Thread{
    private String inquiry;
    private Listener listeners;

    MyThread(String inquiry, Listener listeners){
        this.inquiry = inquiry;
        this.listeners = listeners;
    }

    @Override
    public void run(){
        //create and open enquiry
        try{
            listeners.threadOnRunnable(getState(), getId());
            URL url = new URL(inquiry);
            URLConnection urlConnection = url.openConnection();

            String line ="";
            String newLine = "" ;

            // Get response and form the row
            InputStream inputStream = urlConnection.getInputStream();
            InputStreamReader reader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(reader);

            while ((line = bufferedReader.readLine()) != null ){
                newLine += line;
            }

            //Response back parsing
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            Wiki a = gson.fromJson(newLine, Wiki.class);

            //Out
            for (Search b : a.getQuery().getSearch()) {
                System.out.println("Flow "+ b.getTitle());
                System.out.println("Flow "+ b.getPageId());
                System.out.println("Flow " +b.getSize());
                System.out.println("Flow " + b.getWordcount()+"\n");
            }
            listeners.onDownload();
        }
        catch (MalformedURLException e) {
            listeners.onError();
            e.printStackTrace();
        }
        catch (IOException e){
            listeners.onError();
            e.printStackTrace();

        }

    }

}

public class Main {

    public static void main(String[] args)  throws IOException {
        // чтение  wiki
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите запрос");
        String searchLine = scanner.nextLine();
        System.out.println();

        searchLine = URLEncoder.encode(searchLine, "UTF-8");
        String inquiry = "https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + searchLine + "\"";

        Listener listeners = new Listener();
        MyThread thread = new MyThread(inquiry, listeners);
        thread.start();

    }
}