package com.mylllket_inc.app;


import java.io.*;

public class MyWriter {
    public void write(String path, String name, String text) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path + name), "UTF-16"));
        bw.write(text);
        bw.flush();
        bw.close();
    }
}
