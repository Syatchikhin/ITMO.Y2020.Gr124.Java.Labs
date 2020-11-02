package com.company;

public class Main {

    public static void main(String[] args) {
	// 10.3 Напишите программу, в которой запускается 100 потоков, каждый из которых
        //вызывает метод increment() 1000 раз.
        //После того, как потоки завершат работу, проверьте, чему равен count .

         MyThread tr = null;

        for (int i = 1; i < 100; i++) {
             tr= new MyThread("Thread №"+ i);
            tr.start();
        }
        try{
            //tr.sleep(3000);
            tr.join();
            }
            catch(InterruptedException e)
            {
                System.out.printf("%s has been interrupted", tr.getName());
        }
        System.out.println("Main thread finished...");
        System.out.println("counter " + Counter.getCount());
   }

}

