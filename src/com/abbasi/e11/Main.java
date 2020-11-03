package com.abbasi.e11;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mohammad.Abbasi
 * @created 03/11/2020
 */
public class Main {
    public static void main(String[] args) {
        ReentrantLock lockA = new ReentrantLock();
        ReentrantLock lockB = new ReentrantLock();
        ReentrantLock lockC = new ReentrantLock();

        Philosefer mohammad = new Philosefer("Mohammad",lockA,lockB);
        Philosefer edris = new Philosefer("Edris",lockB,lockC);
        Philosefer vahid = new Philosefer("Vahid",lockC,lockA);

        mohammad.start();
        edris.start();
        vahid.start();
    }
}
