package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
	// 9.2 Написать метод, который записывает в файл строку, переданную параметром.
        String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_2\\src\\com\\company\\";
        String fileName_0 = "text0.txt";
        String fileName_1 = "text1.txt";
        String fileName_2 = "text2.txt";
        String fileName_3 = "text3.txt";
        String content = "Однажды в студеную зимнюю пору я из лесу вышел";

                List<String> stringList = new ArrayList<>();
                    stringList.add("В тот год осеняя погода ");
                    stringList.add("Стояла долго на дворе, ");
                    stringList.add("Зимы ждала, ждала природа ");
                    stringList.add("Снег выпал только в январе ");


        MyFileWriter_0( filePath, fileName_0, stringList);
         //MyFileWriter_1( filePath, fileName_1, content);
        //MyFileWriter_2( filePath, fileName_2, content);


    }

    public static void  MyFileWriter_0( String p, String n, List<String> c){
        String filePath = p;
        String fileName = n;
        List<String> content = c;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter( filePath+fileName))){

            for (String element : content) {
                bw.write(element);
                bw.write("\n");
            }


        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        System.out.println("Done");


    }




   public static void  MyFileWriter_1( String p, String n, String c) throws IOException {
    String filePath = p;
    String fileName = n;
    String  content = c;

       FileWriter br = new FileWriter(new File(filePath+fileName));
       //for(String content : strings){
           br.write(content);
       //}
   }

    public static void  MyFileWriter_2( String p, String n, String c)
    {
        String filePath = p;
        String fileName = n;
        String  content = c;
        //OutputStream = c;
       OutputStream outputStream;
        int bytes = 128;
       try {
           outputStream = new FileOutputStream(filePath + fileName );
           outputStream.write(bytes);
           outputStream.close();
       } catch (IOException e) {
           e.printStackTrace();

    }








    }
}
