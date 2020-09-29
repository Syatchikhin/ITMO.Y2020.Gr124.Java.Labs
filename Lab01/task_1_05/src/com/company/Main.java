package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner in = new Scanner(System.in);
        System.out.println("Введите числo");
        int n = in.nextInt();


        int sum = 1;
        int a = 0;
        int t;

        for (int i = 3; i <= n; i++) {

            t = a;
            a = sum;
            sum = t + a;
        }


        System.out.println(sum);


    }
}
