package com.abbasi.e05;

/**
 * @author Mohammad.Abbasi
 * @created 28/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shopper mohammad = new Shopper();
        Shopper edris = new Shopper();
        mohammad.start();
        edris.start();
        mohammad.join();
        edris.join();

        System.out.println("garlic count is: "+Shopper.garlicCount);
    }
}
