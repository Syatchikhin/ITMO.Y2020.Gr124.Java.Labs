package com.company;

public class Main {

    public static void main(String[] args) {
        // example
        StringBuilder sb = new StringBuilder("Однажды");

        sb.append(" в студеную");
        sb.append(" зимнюю");
        sb.append(" пору. ");
        sb.append("999");
        sb.append(" ");
        sb.append("3.14");

        System.out.print(sb);
        System.out.print("длина");
        System.out.print(sb.length());

        sb.delete(9,18); // Удалить с по 18 символ
        System.out.print(sb);

        String s1 =sb.toString();
        System.out.print("s1=" + s1);

        String s2 =sb.substring(10,13); //взять 3 символа с конца
        System.out.print("S2= " + s2);
    }
}
