package com.abbasi.e01;

/**
 * @author Mohammad.Abbasi
 * @created 27/10/2020
 */
public class Main {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long usedKB = (runtime.totalMemory() - runtime.freeMemory()) / 1024;

        System.out.println("Process Id:" + ProcessHandle.current().pid());
        System.out.println("Thread Count:" + Thread.activeCount());
        System.out.println("Memory usage:" + usedKB + " KB");

        for (int i = 0; i < 6; i++) {
            new CpuWaster().start();
        }

        usedKB = (runtime.totalMemory() - runtime.freeMemory()) / 1024;
        System.out.println("Process Id:" + ProcessHandle.current().pid());
        System.out.println("Thread Count:" + Thread.activeCount());
        System.out.println("Memory usage:" + usedKB + " KB");
    }
}
