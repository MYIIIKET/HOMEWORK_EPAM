package com.mylllket_inc.app;

import java.io.IOException;

public class ReaderThread extends Thread {
    private PropReader reader;
    private int times;
    private String key;

    public ReaderThread(PropReader reader, int times, String key) {
        this.reader = reader;
        this.times = times;
        this.key = key;
    }

    public void run() {
        for (int i = 0; i < times; i++) {
            try {
                System.out.println(Thread.currentThread().getName().toString());
                reader.getProperty(key);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
