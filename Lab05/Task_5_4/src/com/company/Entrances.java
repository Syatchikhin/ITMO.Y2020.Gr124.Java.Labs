package com.company;

public class Entrances {

    String word;
    String word1;


    Entrances ( String w){
        this.word = w;
    }

    static int checkEntrances(String word, String word1) {
        int counter = 0;
        int index = 0;
        //Boolean  yes = word.contains(  word1 );
        while (index != -1) {

            index = word.indexOf(word1, index);
            //System.out.println("Вхождение: " + index);
            if (index != -1) {
                counter++;
                //word = word.substring(index + 1);
                index += word1.length();
                //System.out.println("Остаток: " + word);

            }
        }

        System.out.println("Всего вхождений: " + counter);
        return counter;
    }
}
