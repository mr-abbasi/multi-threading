package com.abbasi.e09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class Shopper extends Thread {
    private static int notePadItems = 0;
    private int itemsToAdd = 0;
    static Lock pencil = new ReentrantLock();

    Shopper(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (notePadItems <= 20) {
            if ((itemsToAdd > 0) && pencil.tryLock()) {
                pencil.lock();
                notePadItems += itemsToAdd;
                System.out.println(getName() + " added " + itemsToAdd + " item(s) to add in notepad");
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    pencil.unlock();
                }
            } else {
                try {
                    Thread.sleep(100);
                    itemsToAdd++;
                    System.out.println(getName() + " found " + itemsToAdd + " items to buy");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
