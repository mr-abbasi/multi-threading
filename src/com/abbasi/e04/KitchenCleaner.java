package com.abbasi.e04;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class KitchenCleaner extends Thread {
    @Override
    public void run() {
        while (true){
            System.out.println("Kitchen cleaner is cleaning the kitchen");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

