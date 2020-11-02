package com.company;

public class Cenzor {

    String word;

    Cenzor ( String w){
        this.word = w;
    }

    static void checkCenzor( String word) {
        //-----замена слов---------------------------------------------
        while(word.contains("бяка") || word.contains("БЯКА") || word.contains("Бяка")) {
            word = word.replace("бяка", "[вырезано цензурой]");
            word = word.replace("Бяка", "[вырезано цензурой]");
            word = word.replace("БЯКА", "[вырезано цензурой]");
        }
        System.out.println("введенные слова с правкой цензуры: " + word) ;

    }

}
