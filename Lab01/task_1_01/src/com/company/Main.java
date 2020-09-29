package com.company;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        double myarray [] = new double [10];
        double max  = 0;
        double min ;
        double mid = 0;

        //fill array
        for (int i=0; i< myarray.length; i++) {

            myarray [i] = (double)Math.ceil(Math.random()*1000);
        }
        // let's min is the first element
        min = myarray [0];
        // found min and max
        for (int i=0; i< myarray.length; i++) {
            if (myarray [i] > max ){
                max = myarray [i];
            }
            else if (myarray [i] < min ) {
                min = myarray [i];
            }
            //found sum
            mid= mid + myarray [i];
        }
        //found mid
        mid = mid / myarray.length;
        //output all
        for (int i=0; i< myarray.length; i++) {
            System.out.println("Элемент массива #"+ i + " равен " + myarray[i]);
        }
        //output max,min,mid
        System.out.println("max="+ max );
        System.out.println("min="+ min );
        System.out.println("mid="+ mid );

    }
}