package com.abbasi.e09;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shopper mohammad = new Shopper("Mohammad");
        Shopper edris = new Shopper("Edris");
        long start = System.currentTimeMillis();
        mohammad.start();
        edris.start();
        mohammad.join();
        edris.join();
        long end = System.currentTimeMillis();

        System.out.println("time: "+(float)(end - start) / 1000+" seconds");
    }
}
