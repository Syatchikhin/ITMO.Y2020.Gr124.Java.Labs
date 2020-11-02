package com.company;

public class Main {

    public static void main(String[] args) {
        // Написать метод для поиска наибольшего элемента в двумерном массиве.
        int max = 0;
        int imax;
        int jmax;
        try {
            int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
             imax = array[0].length;
             jmax = array.length;
            for (int i = 0; i < imax; i++) {
                for (int j = 0; j < jmax; j++) {

                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
            }


            // на случай ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Что-то не так");
        }


        System.out.println("max= "+ max);
    }
}
