package com.abbasi.e10;

/**
 * @author Mohammad.Abbasi
 * @created 31/10/2020
 */
public class Main {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new CalendarUser("Writer-"+i).start();
        }
        for(int i=0;i<10;i++){
            new CalendarUser("Reader-"+i).start();
        }
    }
}
