package com.abbasi.e08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class Shopper extends Thread {
    static int garlicCount, potatoCount = 0;
    private static ReentrantLock pencil = new ReentrantLock();

    private void addGarlic() {
        pencil.lock();
        System.out.println(pencil.getHoldCount());
        garlicCount++;
        pencil.unlock();
    }

    private void addPotato() {
        pencil.lock();
        potatoCount++;
        addGarlic();
        pencil.unlock();
    }

    @Override
    public void run() {
        for(int i =0;i<10_000_000;i++){
            addGarlic();
            addPotato();
        }
    }
}
