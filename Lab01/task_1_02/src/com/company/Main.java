// задание 2
package com.company;
import java.io.DataInput;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Находим сумму для выражения вида: 1^K+2^K+3^K+...+N^K \n");
        System.out.print("Введите N: ");
        int n = in.nextInt();
        System.out.print("Введите k: ");
        int k = in.nextInt();

        int sum = 0;
        for (int i = 1; i<n+1; i++ ) {
            sum = sum + power(i,k);
            //System.out.printf("Your number: %d \n", sum);
        }
        System.out.printf("Your number: %d \n", sum);
        in.close();
    }

        static int power(int a, int b){
            int result = 1;
            for (int i=1; i<=b; i++){
                result = result*a;
            }
            return result;
        }
}