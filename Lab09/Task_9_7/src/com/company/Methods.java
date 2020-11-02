package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Methods {
    public static Integer result1;

    //Methods
    //Read
    public static ArrayList<String> Read_0 (String p, String n){
        String filePath = p;
        String fileName = n;
        Integer result1;

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

   static Function <String, Integer> fileSize = (fs) -> {
        Integer result ;
        result = fs.length();
        return result;
    };

}

