package com.company;

public class Main {

    public static void main(String[] args) {
        //  Написать метод, который проверяет, является ли двумерные массив квадратным.

        int imax;
        int jmax;

        try {
            //int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};

            imax = array[0].length;
            jmax = array.length;
            if (imax != jmax) throw new Exception("The array is not rectangle");

            else{
                System.out.println("The array is  rectangle");
            }

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }

    }
}

