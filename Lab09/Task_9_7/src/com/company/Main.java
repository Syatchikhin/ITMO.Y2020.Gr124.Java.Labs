package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // 9.7  Написать метод, который в каталоге ищет файлы удовлетворяющие любому
        //критерию, который задается с помощью java.util.function.Function.

                String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_7\\src\\com\\company\\";

                File direct = new File (filePath);
                ArrayList<String> content = new ArrayList<String>();

                String searchRow = "Татьяна";
                //String searchRow = "Вечор";
                //String searchRow = "Выпьем с горя; где же кружка?";

                for(File myFile: direct.listFiles()){
                    String myFileName = myFile.getName();

                    //check system directory //**
                    if (!myFileName.equals("Main.java")){  //**
                        //Read file
                        ArrayList<String> st1 = Methods.Read_0(filePath, myFileName);

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
                        // out
                       Integer fs = Methods.fileSize.apply(s);
                        System.out.println(s);
                        System.out.println("Длина имени файла: " + fs + " символов");
                    }

                }else{
                    System.out.println("Искомый текст не найден");
                }
    }
}
