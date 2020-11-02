package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

   public static void main(String[] args) {
                // 9.6 Написать метод, который в каталоге ищет текстовые файлы, в которых содержится
                //определенная строка, и который возвращает список имен таких файлов.

                String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_6\\src\\com\\company\\";
                //String fileSourceName = "text1.txt";
                //String fileResultName = "text2.txt";

                File direct = new File (filePath);
                ArrayList<String> content = new ArrayList<String>();

                //String searchRow = "Татьяна";
                //String searchRow = "Вечор";
                String searchRow = "Выпьем с горя; где же кружка?";
                String fileContentPiece;

                for(File myFile: direct.listFiles()){
                    String myFileName = myFile.getName();

                    //check system directory //**
                    if (!myFileName.equals("Main.java")){  //**
                        //Read file
                        ArrayList<String> st1 = Read_0(filePath, myFileName);

                        //Search
                        for (String row : st1) {

                            if (row.contains(searchRow)) {
                                content.add(myFile.getName());
                            }

                        }

                    } //**
                }
       if (content.size()!=0){
           System.out.println("Искомый текст содержится в файле/файлах:");
           for (String s: content) {
               System.out.println(s);

           }
       }else{
           System.out.println("Искомый текст не найден");
       }

  }
    //Methods
        //Read
        public static ArrayList<String> Read_0 (String p, String n){
            String filePath = p;
            String fileName = n;

            try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {
                String line;
                ArrayList<String> content = new ArrayList<String>();
                while ((line = br.readLine()) != null) {
                    content.add(line);
                }
                return content;

            } catch (FileNotFoundException e) {
                System.out.println("File not found");

            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
}
