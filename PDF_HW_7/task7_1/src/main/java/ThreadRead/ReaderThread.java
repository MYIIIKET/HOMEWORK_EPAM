package ThreadRead;

import com.mylllket_inc.app.TransactionPackage.TransactionReader;

import java.io.IOException;

public class ReaderThread extends Thread {
    private TransactionReader transactionReader;

    public ReaderThread(TransactionReader transactionReader) {
        this.transactionReader = transactionReader;
    }

    public void run() {
        try {
            this.transactionReader.getTransactions();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
