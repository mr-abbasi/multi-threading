package com.abbasi.e08;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Shopper mohammad = new Shopper();
        Shopper edris = new Shopper();
        mohammad.start();
        edris.start();
        mohammad.join();
        edris.join();

        System.out.println("We should buy " + Shopper.garlicCount + " garlics");
        System.out.println("We should buy " + Shopper.potatoCount + " potatoes");
    }
}
