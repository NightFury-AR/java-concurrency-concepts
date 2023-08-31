package com.nightfury.concurrency.section01.T03_vaulthacking;

public class Vault {
    private long secretPin;

    public Vault(long secretPin) {
        this.secretPin = secretPin;
    }

    public boolean openVault(long secretPin) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return secretPin == this.secretPin;
    }
}
