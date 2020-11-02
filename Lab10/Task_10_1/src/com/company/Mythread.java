package com.company;

class MyThread extends Thread{
    public MyThread(String threadName) {
    }

    @Override
    public void run() {
        String threadName = currentThread().getName();
        String st = (currentThread().getState()).toString();
        Boolean on = currentThread().isAlive();
        System.out.println("Before start: Thread №:" +threadName + " status is: " + on.toString() + "state:" + st );

        for (int j = 0; j <= 100; j++) {
            int threadNumber = activeCount();
            st = (currentThread().getState()).toString();
            on = currentThread().isAlive();
            threadName = currentThread().getName();
            System.out.println("Active count: " + threadNumber + "  calculates: " + j + " from 100 Thread №: " +threadName + " status is: " + on.toString()+ "state:" + st);
        }
        st = (currentThread().getState()).toString();
        on = currentThread().isAlive();
        threadName = currentThread().getName();
        System.out.println("After finish: Thread №:" +threadName + " status is: " + on.toString() + "state: " + st);

    }
}
