package com.company;

import java.util.Scanner;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
	//  Используя Stringbuilder, читайте слова с консоли и затем склейте их в одну строку
    //через запятую
        String text = "";
        // Создать буфер пустой буфер
        StringBuffer buffer = new StringBuffer("");

        do {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        text = scanner.nextLine();

            buffer.append(text);
            buffer.append(", ");

            //System.out.println("Ваш текст: " + buffer.toString());
        }
       while (!text.equals("quit"));

       buffer.delete(buffer.length()-8, buffer.length());
       buffer.append(".");
       System.out.println("Ваш конечный текст: " + buffer.toString());

    }
}
