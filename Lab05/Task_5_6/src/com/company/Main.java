package com.company;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {

     //String Paths = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab05\\Task_5_6";
     //String Paths = "E:\\Max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab05\\Task_5_6\\src\\com\\company";

        String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), "UTF-8");

       // String content = new String(Files.readAllBytes(Paths.get("readMe.txt")), StandardCharsets.UTF_8);



        //String text = Files.toString(new File("readMe.txt"), StandardCharsets.UTF_8);
        //String text = new File("readMe.txt"), StandardCharsets.UTF_8);


        //Чтение строки

    // Словарь 2-Б

    //чтение букв по одной и запись в массив

    //Вывод числа вхождений каждой буквы и процент от общего
        //System.out.println("Наш текст: " + context);

    }
}
