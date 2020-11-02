package com.company;

public class Palindrom {

    static void checkPolyndrom( String word) {
        String textWithOutGaps = word.toLowerCase().replaceAll(" ", "");
        String reversedText = new StringBuilder(textWithOutGaps).reverse().toString();
        System.out.println ( reversedText.equals(textWithOutGaps) ? "Полиндром" : "Не полиндром"); //Тернарный оператор

    }
}
