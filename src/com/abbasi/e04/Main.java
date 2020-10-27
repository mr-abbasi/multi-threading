package com.abbasi.e04;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        KitchenCleaner cleaner = new KitchenCleaner();
        cleaner.start();
        cleaner.setDaemon(true);

        Thread.sleep(600);
    }
}
