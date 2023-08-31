package com.nightfury.concurrency.section01;

import java.math.BigInteger;

public class T04_ThreadInterruption {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask(new BigInteger("1001"),new BigInteger("2")));
        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        private BigInteger base;
        private BigInteger pow;

        public BlockingTask(BigInteger base, BigInteger pow) {
            this.base = base;
            this.pow = pow;
        }

        @Override
        public void run() {
            System.out.println("Base - "+this.base+" pow -> "+this.pow+" ==> "+findThePower(this.pow,this.base));
        }

        BigInteger findThePower(BigInteger pow, BigInteger base) {
            BigInteger result = BigInteger.ONE;
            for(BigInteger i = BigInteger.ZERO; i.compareTo(pow) != 0; i = i.add(BigInteger.ONE)) {
                if(Thread.currentThread().isInterrupted()) {
                    System.out.println("Interrupt");
                    return BigInteger.ZERO;
                }
                result.multiply(i);
            }
            return result;
        }
    }
}
