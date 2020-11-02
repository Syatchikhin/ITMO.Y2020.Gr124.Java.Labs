package com.company;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// 11.2 Метод получает на вход массив элементов типа К.
        //Вернуть надо объект Map<K, Integer>, где K — Значение из массива, а Integer
        //количество вхождений в массив.
        //<K> Map<K, Integer> arrayToMap(K[] ks);
        String[] array = new String[]{"1","2","3","4","5","1"};


        TaskToMap taskToMap = new TaskToMap(array);
        for(Map.Entry<String, Integer> item:taskToMap.arrayToMap().entrySet()){
            System.out.printf("Key %s Value: %s ", item.getKey(), item.getValue());
        }
    }
}
