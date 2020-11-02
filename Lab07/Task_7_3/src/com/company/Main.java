package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	//7.3 Дан массив строк . Выведете
        //их все разными способами:
        //По алфавиту
        //По возрастанию длины
        //По количеству вхождений цифр в строку
        //*  Для сортировка используется Arrays.sort() с параметром Comparator.
        //Для вывода строк из массива можно использовать Arrays.toString().

        String st[] = new String[]{
                "...Мама мыла раму 888",
                "...Саша шла по шоссе и сосала сушку 1",
                "...Кто ходит в гости по утрам",
                "...Корабли лавировали 23",
                "...А роза упала на лапу Азора",
                "...Ты помнишь дядя ведь недаром Москва спаленная пожаром"};

        System.out.println("* Начальное состояние массива");
        for (String s: st){
            System.out.println(s);
        }

        System.out.println("* По количеству цифр");
        Comparator<String> comparedString = new DigitAmountSort();
        Arrays.sort(st, comparedString);
        for (String s: st){
            System.out.println(s);
        }

        System.out.println("* По алфавиту");
        Arrays.sort(st);
        for (String s: st){
            System.out.println(s);
        }

        System.out.println("* По длине строки");
        Comparator<String> stringRowLength = new LengthSort();
        Arrays.sort(st, stringRowLength);
        for (String s: st){
            System.out.println(s);
        }
    }
}
