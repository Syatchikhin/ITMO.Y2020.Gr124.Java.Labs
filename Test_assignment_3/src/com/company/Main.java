package com.company;

import java.awt.*;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        String filePath = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Test_assignment_3\\src\\com\\company\\";
        String fileDownloadPath = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Test_assignment_3\\src\\com\\company\\downloads\\";
        String fileSourceName = "fileslist.txt";

        //I. Read a file with list of files
        ArrayList<String> st1 = Methods.Read_0(filePath, fileSourceName);
        Methods.PrintOut(st1);

        //II. Check data in a list, remove duplicates
        List<String> st2 = Methods.RemoveDuplicates(st1);

        //III. Create an array and extract data
        Pair<List<String>> st3 = Methods.SplitData(st2);
        List<String> downloadLinks = st3.first();
        List<String> outputNames = st3.second();

        //Out links and names
        System.out.println("***downloadLinks:***");
        for (String s : downloadLinks) {
            System.out.println("- "+ s);
        }
        System.out.println("***outputNames:***");
        for (String s : outputNames) {
            System.out.println("- "+ s);
        }

        // List to array
        String [] urls = new String[downloadLinks.size()];
        for(int i = 0; i < downloadLinks.size(); i++) urls[i] = downloadLinks.get(i);

        List<Downloader> downloaders = new ArrayList<Downloader>();
        List<Thread> threads = new ArrayList<Thread>();
        for (String url : urls) {
            Downloader downloader = new Downloader(url);
            downloaders.add(downloader);
            Thread thread = new Thread(downloader);
            threads.add(thread);
            thread.start();

        }

        //LOAD
         Methods.DownloadFiles( downloadLinks, fileDownloadPath, outputNames);
        //LOAD

        for (Thread thread : threads)
            thread.join();
        System.out.println("All downloads are finished. ");

        double allLoadSize = 0;
        double allDownloadTime = 0;
        int threadsNumbers = downloaders.size();

        for (Downloader downloader : downloaders) {
            allLoadSize += downloader.getDownloadSize() / 1000;
            allDownloadTime +=  downloader.getDownloadTime() / 1000000000 ;


        }

        // Total output
        System.out.println("Loaded: " + threadsNumbers +" files");
        System.out.printf("Totalsize: %.4f KB\n",  allLoadSize);
        System.out.printf("Time: %.4f  sec\n",  allDownloadTime );

        System.out.printf("Average speed: %.4f  KB/sec\n", (allLoadSize / allDownloadTime)  );


    }
}

class Downloader implements Runnable {
    private String url;
    private long startTimeStamp;
    private long endTimeStamp;
    private long contentSize;
    public Downloader(String url) {
        this.url = url;
    }
    long getDownloadTime() {
        return endTimeStamp - startTimeStamp;
    }
    long getDownloadSize() {
        return contentSize;
    }
    //String fileDownloadPath = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Test_assignment_3\\src\\com\\company\\downloads\\";

    public void run() {
        Path tempDirectory = null;
        String targetDirectory = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Test_assignment_3\\src\\com\\company\\downloads\\"; //**
        String fileOutName = "weapon.txt"; //**
        try {
            tempDirectory = Files.createTempDirectory("temp");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path tempFile = null;
        try {
            tempFile = Files.createTempFile(tempDirectory, "urldnl", ".txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Download started.");
        try {
            URL url = new URL(this.url);
            contentSize = 0;
            startTimeStamp = System.nanoTime();
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(url.openStream()));

            String line;
            while ((line = dataInputStream.readLine()) != null)
                contentSize += line.length();

            endTimeStamp = System.nanoTime();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Download finished. %d bytes in %.4f seconds.\n", getDownloadSize(), getDownloadTime() / 1000000000d);
    }
}


