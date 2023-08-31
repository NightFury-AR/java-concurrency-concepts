package com.nightfury.concurrency.section01;

// thread creation by runnable
public class T01_ThreadCreation {
    public static void main(String[] args) throws InterruptedException {

        //1.create thread using runnable
        Thread threadUsingRunnable = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " created using runnable !");
            }
        });

        // #NOTE: new Runnable() {...}  is same as () -> {...}, so simplified code would be
        threadUsingRunnable = new Thread(() -> System.out.println(Thread.currentThread().getName() + " created using runnable !"));

        //only start method will make the thread asynchronous
        threadUsingRunnable.start();

        System.out.println("Main Thread " + Thread.currentThread().getName());

        Thread.sleep(2000);
    }
}
