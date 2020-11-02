package com.company;

import org.json.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.net.URLConnection;
import java.net.http.WebSocket;
//import java.text.ParseException;
import java.util.Scanner;

interface DownloadListener{
    void onError();
    void onDownload();
    void threadOnRunnable(Thread.State a, long b);
}

//class Listener implements Downloadlistener{
//    @Override
//    public void onError() { System.out.println("Ошибка");}
//    @Override
//    public void onDownload(){ System.out.println(" Поток ОК");}
//
//    @Override
//    public void threadrunnable(Thread.State a, long b){
//      System.out.println(" a"+ a + "b" + b);
//
//    }
//}

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
	// Wiki
        // Запрос
        Scanner in = new Scanner(System.in);
        System.out.print("Enter request");
        String query = in.nextLine();
        in.close();
        query = URLEncoder.encode(query, "UTF-8");

        //Сcылка
        String targetUrl = "https://en.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=\"" + query + "\"";

//        try {
//            URL myURL = new URL(targetUrl);
//            URLConnection myURLConnection = myURL.openConnection();
//            myURLConnection.connect();
//        }
//        catch (MalformedURLException e) {
//            // new URL() failed
//            System.out.print("new URL() failed");
//            // ...
//        }
//        catch (Exception e) {
//            // openConnection() failed
//            System.out.print("penConnection() failed");
//            // ...
//        }

        String line = "";
        String sumLine = "";

        URL oracle = new URL(targetUrl);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));

        while ((line = in.readLine()) != null) {

            sumLine += line;
        }

        in.close();


        //JsonParse jsonParse = new JsonParse();
        //String output = jsonParse.parse(Connection.executePost(targetUrl));
        //System.out.println(output);

        //Gson gson = new Gson;


        //Listener listners =new Listener();
        //MyThread thread = new MyThread(targetUrl,listeners);
        //thread.start();

        String responseString = "{'to': 'INR', 'rate': 64.806700000000006, 'from': 'USD'}";
        JSONObject responseObject = new JSONObject(responseString);

    }
}
