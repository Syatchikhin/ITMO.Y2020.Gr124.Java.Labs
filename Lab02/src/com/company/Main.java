package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    //create 2 vectors
    Vector mynewvector = new Vector( 3,0,3);
    Vector mynewvector2 = new Vector( 3,3,0);

    //1) calculate vector's length
        double L = mynewvector.vectorLength();
        System.out.printf("L= %.3f\n" , L);
        double L1 = mynewvector2.vectorLength();
        System.out.printf("L1= %.3f\n" , L1);

   //2) scalar
        double myscalar = mynewvector.scalarMultiply (mynewvector2);
        System.out.println("scalar= "+myscalar);

    //3) vector's multiply
        Vector supervector = Vector.vectorMultiply (mynewvector, mynewvector2);
        System.out.println("vector's multiply: " + supervector);

    //4) angle between vector's
        double vectorAngle = Vector.vectorAngle (mynewvector, mynewvector2);
        System.out.println("vector's angle: " + vectorAngle + " degrees");

   //5.1) vector's sub
        Vector vSub = Vector.Sub(mynewvector, mynewvector2);
        System.out.println("vectorSub= "+ vSub);

    //5.2) vector's add
        Vector vAdd = Vector.Add(mynewvector, mynewvector2);
        System.out.println("vectorAdd= "+ vAdd);

    //6) static method in: N out: vector's random array N size

        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество векторов N: ");
        int n = in.nextInt();

        Vector [] Vectors = Vector.ArrayVectors(n);

        for (int i = 0; i< Vectors.length ; i++) {
            System.out.println("vector "+(i+1)+": " + Vectors[i]);
        }
        //************************************
        //    tests
        //************************************

        // int x= (int)(30*Math.random());
        //  System.out.println("x= " + x);

       // int a = 6;
       // int b = 8;
       // int c = 1;
       // int result = sum (a, b, c);

       // System.out.println("result " + result);

    }

   // static int sum(int a, int b, int c){
    //    return  a + b + c;
    //}




}
