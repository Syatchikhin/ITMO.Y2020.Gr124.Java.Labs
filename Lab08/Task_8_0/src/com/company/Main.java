package com.company;

public class Main {

    public static void main(String[] args) {
	// exceptions


        try {
            int  array[] = new int[]{1, 2, 3};
            System.out.println(array[100]);

            // на случай ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Что-то не так");
        }

    }
}
