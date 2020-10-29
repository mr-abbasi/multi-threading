package com.abbasi.e05;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Mohammad.Abbasi
 * @created 28/10/2020
 */
public class Shopper extends Thread {
//    public static int garlicCount = 0;
    public static AtomicInteger garlicCount = new AtomicInteger(0);

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
//            garlicCount++;
            garlicCount.incrementAndGet();
        }
    }
}
