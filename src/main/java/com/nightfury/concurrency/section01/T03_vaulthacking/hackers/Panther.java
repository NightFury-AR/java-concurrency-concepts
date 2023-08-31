package com.nightfury.concurrency.section01.T03_vaulthacking.hackers;

import com.nightfury.concurrency.section01.T03_vaulthacking.Vault;

public class Panther extends Hacker {

    public Panther(Vault vault, int skill) {
        super(vault, skill);
        this.setName(this.getClass().getSimpleName());
    }
}
