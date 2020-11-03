package com.abbasi.e11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mohammad.Abbasi
 * @created 03/11/2020
 */
public class Philosefer extends Thread {
    private final ReentrantLock chopSticks1;
    private final ReentrantLock chopSticks2;
    static int sushiCount = 500_00;

    public Philosefer(String name, ReentrantLock chopSticks1, ReentrantLock chopSticks2) {
        setName(name);
        this.chopSticks1 = chopSticks1;
        this.chopSticks2 = chopSticks2;
    }

    @Override
    public void run() {

        while (sushiCount > 0) {

            chopSticks1.lock();
            if (chopSticks2.tryLock()) {
                sushiCount--;
                System.out.println(getName() + " ate sushi. count of sushi is: " + sushiCount);
                try {
                    if (sushiCount == 10000) {
                        System.out.println(10 / 0);
                    }
                } finally {
                    chopSticks2.unlock();
                }

            }
            chopSticks1.unlock();
        }
    }
}
