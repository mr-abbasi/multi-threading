package com.abbasi.e06;

/**
 * @author Mohammad.Abbasi
 * @created 29/10/2020
 */
public class Shopper extends Thread {
    static int garlicCount = 0;

    private static synchronized void addGarlic() {
        garlicCount++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            addGarlic();
        }
    }
}
