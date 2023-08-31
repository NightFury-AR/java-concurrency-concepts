package com.nightfury.concurrency.section01.T03_vaulthacking.police;

public class BATMAN extends Thread {

    @Override
    public void run() {
        this.setName("BATMAN");
            try {
                for (int i = 0; i < 10; i++) {
                    System.out.println("ATTACK:"+i+" 🦇");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("BATMAN SAVED VAULT !!! ");
            System.exit(0);
    }
}
