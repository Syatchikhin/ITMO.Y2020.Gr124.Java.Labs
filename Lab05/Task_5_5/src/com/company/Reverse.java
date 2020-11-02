package com.company;

public class Reverse {

// String word;
//   The given string is: This is a test string
//    The string reversed word by word is:
//    sihT si a tset gnirts

    static void makeReverse(String words) {
        String result;
        int counter ;
        StringBuffer buffer;
        StringBuffer buffer1;

        // Создать буфер для предложения и пустой буфер
        buffer = new StringBuffer(words);
        buffer1 = new StringBuffer("");
        //Перевернуть предложение
        buffer.reverse();

        String s = buffer.toString();
        //Разбить строку на слова
        String[] arr = s.split(" ");
        // сосчитать кол-во слов
        counter = arr.length;
        // взять слова с конца по одному
        for ( int i=counter-1;  i>=0 ; i--) {
            //Записать слово в конец списка
            buffer1.append(arr[i]);
            buffer1.append(" ");
           //System.out.println("Результат разбиения: " + arr[i]);
       }
        // преобразовать в строку
        result = buffer1.toString();
        // Обрезать пробелы и вывести результат
        System.out.println("Результат: " + result.trim());

    }
}
