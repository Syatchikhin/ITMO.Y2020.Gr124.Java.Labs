package com.company;

public class Main {

    public static void main(String[] args) {
	// 10.1-2 Напишите программу, в которой запускается 10 потоков и каждый из них выводит
        //числа от 0 до 100.
        //public int count = 0;
        //Выведете состояние потока перед его запуском, после запуска и во время выполнения
        for (int i = 1; i <= 10; i++) {
           String ThreadName = "№" + i;
            new MyThread(ThreadName).start();
        }
    }
}
