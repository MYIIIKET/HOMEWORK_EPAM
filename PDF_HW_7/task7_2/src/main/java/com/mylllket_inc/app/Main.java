package com.mylllket_inc.app;

import java.io.FileNotFoundException;
import java.util.Properties;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        PropReader reader1 = new PropReader("Data/data.properties");
        PropReader reader2 = new PropReader("Data/data.properties");
        PropReader reader3 = new PropReader("Data/data.properties");
        PropReader reader4 = new PropReader("Data/data.properties");
        PropReader reader5 = new PropReader("Data/data.properties");

        ReaderThread thread1 = new ReaderThread(reader1, 500, "a");
        ReaderThread thread2 = new ReaderThread(reader1, 100, "c");
        ReaderThread thread3 = new ReaderThread(reader1, 400, "e");
        ReaderThread thread4 = new ReaderThread(reader1, 200, "g");
        ReaderThread thread5 = new ReaderThread(reader1, 300, "h");

        thread5.start();
        thread1.start();
        thread4.start();
        thread2.start();
        thread3.start();
    }
}
