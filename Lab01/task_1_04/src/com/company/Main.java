package com.company;
import java.util.ArrayList;

//4 Вычислить простые числа от 2 до 100
public class Main {

    public static void main(String[] args) {

            int myarray [] = new int [100];

            for (int a=2; a< myarray.length; a++) {

                for (int b=2; b< myarray.length; b++) {
                    if (a%b == 0  && a!=b) {
                        //System.out.println("Число a"+ a + "b=" + b + " не простое ");
                        break;
                    }
                    if (a%b == 0  && a==b) {
                        System.out.println("Число " + b + " - простое ");
                    }
                }

            }

    }
}
