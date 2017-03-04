package com.mylllket_inc.app;


import java.io.*;

public class MyReader {

    public String read(String path) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "UTF-8"));

        int data;
        StringBuilder result = new StringBuilder();

        while ((data = br.read()) != -1) {
            result.append((char) data);
        }
        br.close();

        return result.toString();
    }
}
