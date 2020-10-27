package com.abbasi.e03;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Mohammad calls Edris to cook");
        Thread chefEdris = new ChefEdris();
        System.out.println("Edris State: "+ chefEdris.getState());

        System.out.println("Edris starts his work");
        chefEdris.start();
        System.out.println("Edris State: "+ chefEdris.getState());

        System.out.println("Mohammad is working");
        Thread.sleep(500);
        System.out.println("Edris State: "+chefEdris.getState());

        System.out.println("Mohammad is waiting until Edris finishes his work");
        chefEdris.join();
        System.out.println("Edris State: "+chefEdris.getState());

        System.out.println("the dinner is ready");
    }
}
