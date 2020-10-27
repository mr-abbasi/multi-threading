package com.abbasi.e02;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class VegetableChopper extends Thread {
    public int chopCount = 0;
    public static boolean stopChopping = false;

    public VegetableChopper(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        while(!stopChopping){
            System.out.println(this.getName()+" is chopping vegetable");
            this.chopCount++;
        }
    }
}
