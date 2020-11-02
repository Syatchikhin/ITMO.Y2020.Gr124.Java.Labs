package com.company;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
public class Main {

    public static void main(String[] args) {
        // 9.4 Написать метод для копирования файла (побайтно, или массивами байт).

        String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_4\\src\\com\\company\\";
        String fileSourceName = "text1.txt";
        String fileResultName = "text2.txt";

        try (FileInputStream inputStream = new FileInputStream(filePath + fileSourceName);
             FileOutputStream outputStream = new FileOutputStream(filePath + fileResultName)) {

            byte[] data = new byte[inputStream.available()];

            inputStream.read(data, 0, data.length);
            outputStream.write(data);

            System.out.println("Copy is done");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (Exception e) {
            e.printStackTrace();
        }




    }
}
