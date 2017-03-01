package com.mylllket_inc.app;

import java.io.*;

public class FileIOStream {
    private FileInputStream inputStream;
    private String path;

    public FileIOStream(String path) throws FileNotFoundException {
        File f = new File(path);
        if (f.exists() && !f.isDirectory()) {
            this.path = path;
        } else throw new FileNotFoundException();
    }

    public String read() throws IOException {
        inputStream = new FileInputStream(path);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "Cp1251");
        int data = inputStreamReader.read();

        StringBuilder result = new StringBuilder();
        while (data != -1) {
            result.append((char) data);
            data = inputStreamReader.read();
        }
        inputStream.close();
        return result.toString();
    }
}
