package com.company;

class MyThread extends Thread{
    public MyThread(String threadName) {
    }

    @Override
    public void run() {
    //public void synchronized run() {
        String threadName = currentThread().getName();
        Boolean on = currentThread().isAlive();

        for (int j = 0; j <= 1000; j++) {
            Counter.increment();
            int threadNumber = activeCount();
            on = currentThread().isAlive();
            threadName = currentThread().getName();

            //System.out.println("Active count: " + threadNumber + "  calculates: " + j + " from 10 Thread №: " +threadName + " status is: " + on.toString());
        }
    }
}
