package com.company;

public  class Counter {
    static int count = 0;

    public static void increment() {
        count = count + 1;
    }

    public static int getCount() {
        return count;
    }
}