package com.company;

public class Main {

    public static void main(String[] args) {
	// 10.4
        //System.out.println("Main thread started...");

        //MyThread t1= new MyThread("MyThread1 ");
        //MyThread t2= new MyThread("MyThread2 ");
        Object object = new Object();
        new MyThread(object).start();
        new MyThread(object).start();

    }
}
