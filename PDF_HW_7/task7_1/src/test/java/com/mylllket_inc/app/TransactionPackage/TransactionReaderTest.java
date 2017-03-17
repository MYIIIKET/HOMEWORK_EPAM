package com.mylllket_inc.app.TransactionPackage;




import junit.framework.TestCase;

import java.io.FileNotFoundException;


public class TransactionReaderTest extends TestCase {
//    @Test(expected = FileNotFoundException.class)
    public void testThatFileNotFound() throws FileNotFoundException {
        TransactionReader reader = new TransactionReader("aaa");
    }

//    @Test
    public void testThatFileFound() throws FileNotFoundException {
        TransactionReader reader = new TransactionReader("Data/transactions.txt");
    }

//    @Test
    public void testGetTransactions() throws Exception {
        TransactionReader reader = new TransactionReader("Data/transactions.txt");
        Transaction[] transactions = reader.getTransactions();
        System.out.println(transactions[3].getId());
    }

}