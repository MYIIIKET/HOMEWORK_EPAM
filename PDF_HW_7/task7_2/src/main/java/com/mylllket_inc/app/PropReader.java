package com.mylllket_inc.app;

import java.io.*;
import java.util.Properties;

public class PropReader {
    private String path = null;

    public PropReader(String path) throws FileNotFoundException {
        File f = new File(path);
        if (!f.exists() || f.isDirectory())
            throw new FileNotFoundException();
        else
            this.path = path;
    }

    public String getProperty(String key) throws IOException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(this.path);
        synchronized (PropReader.class) {
            prop.load(input);
        }
        input.close();
        String p = prop.getProperty(key);
        if (p == null)
            throw new NullPointerException();
        else
            return prop.getProperty(key);
    }
}
