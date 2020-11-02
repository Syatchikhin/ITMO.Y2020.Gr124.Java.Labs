package com.company;

import java.io.File;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// 9.5  Написать метод, который в каталоге ищет файлы, в имени которых содержится
    //определенная строка, и который возвращает список имен таких файлов.

        String filePath = "E:\\max\\Programming\\09_Java_Romanova\\ITMO.Y2020.Gr124.Java.Labs\\Lab09\\Task_9_5\\src\\com\\company\\";
        //String fileSourceName = "text1.txt";
        //String fileResultName = "text2.txt";

        File direct = new File (filePath);
        ArrayList<String> content = new ArrayList<String>();

        //String searchRow = "Зимн";
        //String searchRow = "Main";
        //String searchRow = ".txt";
        String fileNamePiece;

        for(File myFile: direct.listFiles()){
            String myFileName = myFile.getName();

            if (myFileName.contains(searchRow)) {
                content.add(myFile.getName());
            }
//
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
}
