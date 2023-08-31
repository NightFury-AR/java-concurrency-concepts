package com.nightfury.concurrency.section01;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T05_ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        List<Long> nums = Arrays.asList(0L,9999999999993435L,35434L,4656L,23L,2435L,5566L);
        //create one thread for each item
        List<FactorialThread> threads =
                nums
                        .stream()
                        .map(FactorialThread::new)
                        .toList();

        // start each thread
        threads.forEach(Thread::start);
        // join each
        /*for (FactorialThread thread : threads) {
            thread.join();
        }*/

        // check result
        for (int i = 0;i < nums.size(); i++) {
            FactorialThread t = threads.get(i);
            if (t.isFinished) {
                System.out.println("Factorial of "+nums.get(i)+" is "+t.getResult());
            } else {
                System.out.println(" Calculation is in progress for "+nums.get(i));
            }
        }
    }

    public static class FactorialThread extends Thread {
        private long inputNumber;
        private BigInteger result = BigInteger.ZERO;
        private boolean isFinished = false;

        public FactorialThread(long inputNumber) {
            this.inputNumber = inputNumber;
        }

        private BigInteger findFactorial(long n) {
            BigInteger temp = BigInteger.ONE;
            for (long i = n; i > 0 ;i--) {
                temp = temp.multiply(new BigInteger(Long.toString(i)));
            }
            return temp;
        }

        public boolean isFinished() {
            return this.isFinished;
        }

        public BigInteger getResult() {
            return this.result;
        }

        @Override
        public void run() {
            this.result = findFactorial(this.inputNumber);
            this.isFinished = true;
        }
    }
}
