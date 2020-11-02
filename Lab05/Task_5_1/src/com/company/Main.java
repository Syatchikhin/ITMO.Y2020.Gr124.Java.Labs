package com.company;
import java.util.TreeSet;
public class Main {

    public static void main(String[] args) {
        // 1. Самая длинная строка
        TreeSet <String> rows = new TreeSet<String>();
        rows.add("С утра садимся мы в телегу");
        rows.add("Во глубине сибирских руд");
        rows.add("Однажды");
        rows.add("Однажды в");
        rows.add("Однажды в студеную");
        rows.add("Однажды в студеную зимнюю");
        rows.add("Однажды в студеную зимнюю пору");
        rows.add("В субботу пятого апреля...");
        rows.add("Ты помнишь дядя ведь недаром Москва спаленная пожаром");
        rows.add("Хорошая девочка Лида");

        String longest = "";

        for (String row : rows ){
            if (row.length() > longest.length()) {
                longest = row;
            }
        }
        System.out.print("Самая длинная строка:\n");
        System.out.print(longest);
    }
}

