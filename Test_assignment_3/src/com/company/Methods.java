package com.company;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.nio.file.Path;

public class Methods {
    public static int filesListRows;


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
//PrintOut
    public static void PrintOut(ArrayList<String> data){
        ArrayList<String> st1 = data;
        System.out.println("содержимое файла fileslist:");
        for (String s : st1) {
            System.out.println(s);
        }
         filesListRows = st1.size();
        System.out.println("total " + filesListRows +" files");
    }
//removeDuplicates
    public static List<String> RemoveDuplicates(ArrayList<String> data){

        data = new ArrayList<String>(new LinkedHashSet<String>(data)); // в массив

        System.out.println("без повторов файл fileslist:");
        for (String s : data) {
            System.out.println(s);
        }
        return data;
    }
// Split data
    public static Pair<List<String>> SplitData(List<String> dataForSplit){

        System.out.println("Файл разделен!!!");

        List<String> output1 = new ArrayList<>(dataForSplit.size());
        List<String> output2 = new ArrayList<>(dataForSplit.size());

        for(String item:dataForSplit){
            String[] splitted = item.split(" ");
            output1.add(splitted[0]);
            output2.add(splitted[1]);
        }
            return new Pair<List<String>>(output1, output2);
   }

//Download files
public synchronized static Path download2(String sourceURL, String targetDirectory, String fileOutName) throws IOException
{
    URL url = new URL(sourceURL);
    String fileName = sourceURL.substring(sourceURL.lastIndexOf('/') + 1, sourceURL.length());
    Path targetPath = new File(targetDirectory + File.separator + fileOutName).toPath();
    Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
    return targetPath;
}

public static void DownloadFiles ( List<String> Url2, String Path2 , List<String> Names2){

        List<String> ListOutNames = Names2;
    for (int i =0; i< ListOutNames.size(); i++) {
        String path1 = Path2;
        String url1 = Url2.get(i);
        String name1 = ListOutNames.get(i);
        try {

            download2(url1, path1, name1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  }
}
