package com.company;

public class Main {

    public static void main(String[] args) {

        double myarray [] = new double [30];
        double currentvalue = 0;
        int begin;

        //fill array
        for (int i=0; i< myarray.length; i++) {

            myarray [i] = Math.abs((double)Math.ceil(Math.random()*1000));
        }
        //сортировка вставкой

        // for (  begin = 0; begin < myarray.length; begin++) {
        // смотрим текущий элемент
        //  currentvalue = myarray[begin];
        // Перемещаемся по элементам, которые перед текущим элементом
        //  int i = begin - 1;
        //  for (; i >= 0; i--) {
        // Если текущее значение меньшее — перемещаем больший элемент в конец
        //   if (currentvalue < myarray[i]) {
        //      myarray[i + 1] = myarray[i];
        //  } else {
        // Если текущий элемент больше — стоп сортировка
        //      break;
        //  }
        //}
        // В вакантное место вставляем текущее значение
        //  myarray[i + 1] = currentvalue;
        // }

        //сортировка выбором

        for (int i = 0; i < myarray.length; i++) {
            // pos - первый элемент 0
            int pos = i;
            double min = myarray[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < myarray.length; j++) {
                if (myarray[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = myarray[j];
                }
            }
            myarray[pos] = myarray[i];
            myarray[i] = min;    // меняем местами наименьший и array[i]
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