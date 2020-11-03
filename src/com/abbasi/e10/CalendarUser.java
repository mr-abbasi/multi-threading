package com.abbasi.e10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class CalendarUser extends Thread {
    static String[] weekendDays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    static ReentrantReadWriteLock marker = new ReentrantReadWriteLock();
    static int today = 0;
    static Lock markerWrtie = marker.writeLock();
    static Lock markerRead = marker.readLock();


    CalendarUser(String name) {
        setName(name);
    }

    @Override
    public void run() {
        while (today < weekendDays.length - 1) {
            if (getName().contains("Writer")) {
                markerWrtie.lock();
                today = (today + 1) % 7;
                System.out.println(getName() + " write day");
                markerWrtie.unlock();
            } else {
                markerRead.lock();
                System.out.println(getName() + " read day, today is: " + weekendDays[today] +", reader thread counts: "+marker.getReadLockCount());
                markerRead.unlock();
            }
        }
    }
}
