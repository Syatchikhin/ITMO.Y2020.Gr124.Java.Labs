package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //9.3. Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один
        String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_3\\src\\com\\company\\";
        String fileSource1Name = "text1.txt";
        String fileSource2Name = "text2.txt";
        String fileResultName = "text3.txt";

        //Read 1st file
        ArrayList<String> st1 = Read_0(filePath, fileSource1Name);
        System.out.println("file_1: ");
        for (String s : st1) {
            System.out.println(s);
        }
        //Read 2nd file
        ArrayList<String> st2 = Read_0(filePath, fileSource2Name);
        System.out.println("file_2: ");
        for (String s : st2) {
            System.out.println(s);
        }
        //Clue both
        for (String s : st2) {
            st1.add(s);
        }
        System.out.println("file_3: ");
        for (String s : st1) {
            System.out.println(s);
        }
        //Write result into a file
        MyFileWriter_0( filePath, fileResultName, st1);
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
            //write
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
                System.out.println("Written");
            }
}
