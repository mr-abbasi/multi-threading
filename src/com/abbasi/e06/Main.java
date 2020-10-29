package com.abbasi.e06;

/**
 * @author Mohammad.Abbasi
 * @created 29/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shopper mohammad = new Shopper();
        Shopper edris = new Shopper();

        mohammad.start();
        edris.start();
        mohammad.join();
        edris.join();

        System.out.println("Garlic Count should be: "+Shopper.garlicCount);
    }
}
