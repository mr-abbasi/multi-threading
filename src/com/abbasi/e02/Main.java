package com.abbasi.e02;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        VegetableChopper mohammad = new VegetableChopper("Mohammad");
        VegetableChopper edris = new VegetableChopper("Edris");

        mohammad.start();
        edris.start();

        Thread.sleep(1000);

        VegetableChopper.stopChopping = true;
        mohammad.join();
        edris.join();

        System.out.println("Mohammad chopped "+mohammad.chopCount+ " vegetables");
        System.out.println("Edris chopped "+mohammad.chopCount+ " vegetables");

    }
}
