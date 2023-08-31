package com.nightfury.concurrency.section01;

import java.util.List;
import java.util.stream.Stream;

public class TestThread {
    public static void main(String[] args) {
        Stream.of(1, 2232, 999999999, 999999999, 999999999, 999999999, 999999999, 999999999, 9)
                .map(LongTask::new)
                .map(Thread::new)
                .forEach(Thread::start);

        //longTask.interrupt();
    }

    public static class LongTask implements Runnable {

        private int range;

        public LongTask(int range) {
            this.range = range;
        }

        @Override
        public void run() {
            for (long i = 0; i < range; i++) {
                String toString = Long.toString(i);
                int length = toString.length();
                if (length > 5 && Thread.currentThread().isInterrupted()) {
                    System.out.println(toString+" =>  "+length);
                    break;
                }
            }
            System.out.println("Hello");
        }
    }
}
