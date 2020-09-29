//Задание 3
package com.company;

public class Main {

    public static void main(String[] args) {

        double myarray [] = new double [30];
        double currentvalue = 0;
        int begin;
        //fill array
        for (int i=0; i< myarray.length; i++) {

            myarray [i] = (double)Math.ceil(Math.random()*1000);
        }
        //сортировка вставкой

        for (  begin = 0; begin < myarray.length; begin++) {
            // смотрим текущий элемент
             currentvalue = myarray[begin];
            // Перемещаемся по элементам, которые перед текущим элементом
            int i = begin - 1;
            for (; i >= 0; i--) {
                // Если текущее значение меньшее — перемещаем больший элемент в конец
                if (currentvalue < myarray[i]) {
                    myarray[i + 1] = myarray[i];
                } else {
                    // Если текущий элемент больше — стоп сортировка
                    break;
                }
            }
            // В вакантное место вставляем текущее значение
            myarray[i + 1] = currentvalue;
        }

        //Вывод
        for (int i=0; i< myarray.length; i++) {
            System.out.println("Элемент массива #"+ i + " равен " + myarray[i]);
        }
        //System.out.println("max="+ max );
        //System.out.println("min="+ min );
       //System.out.println("mid="+ mid );

    }
}