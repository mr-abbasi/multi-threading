package com.abbasi.e03;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class ChefEdris extends Thread {
    @Override
    public void run() {
        System.out.println("Edris is ready slice");

        System.out.println("Edris is sleeping while another task finished");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Edris finished his work");
    }
}
