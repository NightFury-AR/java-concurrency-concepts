package com.nightfury.concurrency.section01.T03_vaulthacking.hackers;

import com.nightfury.concurrency.section01.T03_vaulthacking.Vault;

public abstract class Hacker extends Thread {
    private static final long MAX_ATTEMPTS = 12344567879898900L;
    private final Vault vault;
    private int skill;

    public Hacker(Vault vault, int skill) {
        this.vault = vault;
        this.skill = skill * 1000;
    }

    private void crackVault() {
        for (int i = 0; i < MAX_ATTEMPTS; i++) {
            if (vault.openVault(i)) {
                System.out.println(this.getName() + " I GOT YOU 💀");
                System.exit(0);
            }
        }
        System.out.println(this.getName() + " ARRESTED !!!");
    }

    @Override
    public void run() {
        crackVault();
    }
}
