package ThreadRead;

import com.mylllket_inc.app.TransactionPackage.TransactionReader;
import junit.framework.TestCase;

public class ReaderThreadTest extends TestCase {
    public void testTransactionsReadInThread() throws Exception {
        TransactionReader reader1 = new TransactionReader("Data/transactions.txt");
        TransactionReader reader2 = new TransactionReader("Data/transactions.txt");

        ReaderThread readerThread1 = new ReaderThread(reader1);
        ReaderThread readerThread2 = new ReaderThread(reader2);

        readerThread1.start();
        readerThread2.start();
    }

}