package com.nightfury.concurrency.section01;

//thread creation by extending Thread
public class T02_ThreadCreation {
    public static void main(String[] args) throws InterruptedException {
        SampleThread threadByExtendingThread = new SampleThread();
        threadByExtendingThread.start();
        Thread.sleep(2);
    }

    public static class SampleThread extends Thread {
        @Override
        public void run() {
            System.out.println(this.getName() + " created using extending thread class !");
        }
    }
}
