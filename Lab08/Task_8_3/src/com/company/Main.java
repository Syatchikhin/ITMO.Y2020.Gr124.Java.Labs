package com.company;

public class Main {

    public static void main(String[] args) {
        //  Написать метод, который проверяет, является ли двумерные массив квадратным.
        int max = 0;
        int row =0;
        int sum;
        int maxsum = 0;
        int imax;
        int jmax;

        try {
            int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            //int array[][] = new int[][]{{1, 52, 3}, {4, 2, 6}, {7, 8, 9}};
            //int array[][] = new int[][]{{1, 2, 3}, {4, 2, 6}, {7, 8, 9},{97, 8, 9}};
            //int array[][] = new int[][]{{1, 2, 3}, {4, 5, 6}};
            //int array[][] = new int[][]{{1, 2, 3}, {4, -55, 6}, {7, 8, 9}};
            imax = array[0].length;
            jmax = array.length;

            if (imax != jmax) throw new Exception("The array is not rectangle");

            for (int i = 0; i < imax; i++) {
                sum = 0;
                for (int j = 0; j < jmax; j++) {
                    sum = sum + array[i][j];
                    if (array[i][j] < 0 ) throw new Exception("The array's element should be positive");
                    if (array[i][j] > max) {
                        max = array[i][j];
                    }
                }
                System.out.println("сумма чисел "+ (i+1) +" строки= "+  sum);
                if (sum > maxsum){
                    maxsum = sum;
                    row = i;
                }


            }

            System.out.println("max= " + max);
            System.out.println("строка с максимальной суммой "+ (row+1));

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }
        //System.out.println("max= " + max);
    }
}


