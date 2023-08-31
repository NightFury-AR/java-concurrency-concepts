package com.nightfury.concurrency.section01.T03_vaulthacking;

import com.nightfury.concurrency.section01.T03_vaulthacking.hackers.Cyborg;
import com.nightfury.concurrency.section01.T03_vaulthacking.hackers.Hacker;
import com.nightfury.concurrency.section01.T03_vaulthacking.hackers.Panther;
import com.nightfury.concurrency.section01.T03_vaulthacking.police.BATMAN;

import java.util.ArrayList;
import java.util.List;

public class VaultAttack {
    public static void main(String[] args) {
        Vault gothamCityVault = new Vault(1234L);
        Hacker panther = new Panther(gothamCityVault,2);
        panther.setPriority(Thread.MAX_PRIORITY);
        Hacker cyborg = new Cyborg(gothamCityVault,3);
        cyborg.setPriority(Thread.MAX_PRIORITY);
        BATMAN batman = new BATMAN();
        batman.setPriority(Thread.MAX_PRIORITY);

        //attack
        List<Thread> characters = new ArrayList<>();
        characters.add(panther);
        characters.add(cyborg);
        characters.add(batman);

        //begins
        characters.forEach(Thread::start);
    }
}
