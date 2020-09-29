package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double myarray [] = new double [30];
        double currentvalue = 0;
        int begin;
        long start, end; //for timer
        //fill array
        for (int i=0; i< myarray.length; i++) {

            myarray [i] = Math.abs((double)Math.ceil(Math.random()*1000));
        }

        //сортировка выбором

        for (int i = 0; i < myarray.length; i++) {
            // index - первый элемент 0
            int index = i;
            double min = myarray[i];
            // поиск наименьшего элемента
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[j] < min) {
                    index = j;    //  - индекс наименьшего элемента
                    min = myarray[j];
                }
            }
            myarray[index] = myarray[i];
            myarray[i] = min;    // меняем местами
        }

        //Вывод
        for (int i=0; i< myarray.length; i++) {
            System.out.println("Элемент массива #"+ i + " равен " + myarray[i]);
        }
        //System.out.println("max="+ max );
        //System.out.println("min="+ min );
        //System.out.println("mid="+ mid );
        // Ввод значения
        Scanner in = new Scanner(System.in);
        System.out.print("Введите какое значение нужно найти: ");
        double n = in.nextInt();

        //старт поиска перебором
        System.out.print("проведем поиск перебором\n");
        //timer on
        start = System.nanoTime();
        //Перебор
        for (int i=0; i< myarray.length; i++) {
            if ( n == myarray[i] ){

                System.out.print("Такое значение есть, найдено (" + myarray[i] + ")\n");
                break;
            }

        }
            //timer off
        end = System.nanoTime();
        long time = end - start;
        System.out.println("время поиска " + time + " нс");

        System.out.print("продолжим двоичным поиском\n");

        //старт поиска двоичным поиском
        // timer on
        start = System.nanoTime();

        // задаем начало и конец
        int startArray = 0;
        int endArray = myarray.length;
        int divideline;

        // задаем линию разделения посередине
        divideline =( startArray + endArray)/2;

        while ((myarray[divideline] != n) && (startArray <= endArray)) {

            if (myarray[divideline] > n) { //если число в средине > заданного
                endArray = divideline - 1;  // берем 1ю половину
            } else {
                startArray = divideline + 1; // берем 2ю половину
            }
            divideline = (startArray + endArray) / 2; //устанавливаем линию посередине
        }
            if ( startArray <= endArray){
                System.out.print("Ваше значение "+ n + " равно " + myarray[divideline]+"\n");
            }
            else
            {
                System.out.print("Не найдено\n");
            }

        //timer off
        end = System.nanoTime();
         time = end - start;
        System.out.println("время поиска " + time + " нс");

    }



}