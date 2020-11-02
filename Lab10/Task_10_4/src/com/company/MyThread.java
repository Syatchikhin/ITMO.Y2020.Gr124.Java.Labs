package com.company;

class MyThread extends Thread {
    public MyThread(String threadName) {
    }

    Object object;

    public MyThread(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                try {
                    System.out.println(getName());
                    object.notify();
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }
            }
        }

    }
}



