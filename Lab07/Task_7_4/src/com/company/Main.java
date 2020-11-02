package com.company;

public class Main {

    public static void main(String[] args) {
        // Написать метод filter, который принимает на вход массив (любого типа) и
        // реализацию интерфейса filter c методом apply(Object o), чтобы убрать
        // из массива лишнее.
        // Проверьте как он работает на строках или других объектах.
        // абстрактного класса для получения нового значения по индексу.

        Object [] array1 = { "зебра", "верблюд", "волк", 456, "крокодил", "страус", "кошка", 12345678, "собака"};



        Filter filter = new Filter(){
            @Override
            public boolean apply(Object o){
                return o == (String)"зебра";
            }
        };

        Object [] array2 = ApplyFilter.filter(array1, filter);

        String result = "";
        for (Object o: array2) result += " " + (o) + ",";
        System.out.println(result);
    }
}