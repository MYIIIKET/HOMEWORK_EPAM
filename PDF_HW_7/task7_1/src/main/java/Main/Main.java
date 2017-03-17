package Main;


import ThreadRead.ReaderThread;
import com.mylllket_inc.app.TransactionPackage.Transaction;
import com.mylllket_inc.app.TransactionPackage.TransactionReader;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        TransactionReader reader1 = new TransactionReader("Data/transactions.txt");
        TransactionReader reader2 = new TransactionReader("Data/transactions.txt");

        ReaderThread readerThread1 = new ThreadRead.ReaderThread(reader1);
        ReaderThread readerThread2 = new ThreadRead.ReaderThread(reader2);

        readerThread1.start();
        readerThread2.start();
    }
}
