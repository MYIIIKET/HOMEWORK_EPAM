package com.mylllket_inc.app.TransactionPackage;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TransactionReader {
    private String path;
    private Transaction[] transactions;

    public TransactionReader(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists() || f.isDirectory())
            throw new FileNotFoundException();
        else
            this.path = path;
    }

    public Transaction[] getTransactions() throws IOException {
        String data = read(path);
        String[] lines = data.split("\r\n");
        String[] stringTransaction;
        this.transactions = new Transaction[lines.length];


        for (int i = 0; i < lines.length; i++) {
//            System.out.println(Thread.currentThread().getName() + "|||" + i);
            synchronized (TransactionReader.class) {
                stringTransaction = lines[i].split(" ");
                transactions[i] = new Transaction();
                try {
                    transactions[i].setId(Integer.parseInt(stringTransaction[0]));
                } catch (NumberFormatException e) {

                }
                transactions[i].setFrom(stringTransaction[1]);
                transactions[i].setFrom(stringTransaction[2]);
            }
        }
        return transactions;
    }

    private synchronized static String read(String path) throws IOException {
        FileInputStream fin = new FileInputStream(path);
        StringBuilder result = new StringBuilder();
        int data;
        while ((data = fin.read()) != -1) {
            result.append((char) data);
        }
        fin.close();
        return result.toString();
    }
}
