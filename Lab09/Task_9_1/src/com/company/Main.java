package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // 9.1 Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

        String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_1\\src\\com\\company\\";
        String fileName = "text.txt";

        Read_0(filePath, fileName);
        //Read_1( filePath, fileName); // из презентации
        //Read_2( filePath, fileName); // из презентации  - цифры
        //Read_3( filePath, fileName); // Из методички + Ex

    }

    public static void Read_0(String p, String n) {
        String filePath = p;
        String fileName = n;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {
            String line;
            ArrayList<String> content = new ArrayList<String>();
            while ((line = br.readLine()) != null) {
                content.add(line);
            }

            for (String s : content) {
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void Read_1(String p, String n) {
        String filePath = p;
        String fileName = n;

        StringBuilder contentBuilder = new StringBuilder();

        try {
            Stream<String> stream = Files.lines(Paths.get(filePath + fileName), StandardCharsets.UTF_8);
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
            if (contentBuilder.length() == 0) {
                throw new Exception("No data");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.print(contentBuilder);

    }

    public static void Read_2(String p, String n) {
        String filePath = p;
        String fileName = n;
        //Read 2
        try {
            InputStream inputStream = new FileInputStream(filePath + fileName);

            int nRead;
            byte[] data = new byte[128];  // Буфер для чтения

            // nRead - количество прочитанного
            while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
                System.out.println(Arrays.toString(data));
                // System.out.println(Arrays.toChar(data));
            }
        } catch (IOException ex) {
            //catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public static void Read_3(String p, String n) {
        String filePath = p;
        String fileName = n;
        //Read 3
        try (BufferedReader br = new BufferedReader(new FileReader(filePath + fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // process the line.
                line = line + "\n";
                System.out.print(line);
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

    }


}