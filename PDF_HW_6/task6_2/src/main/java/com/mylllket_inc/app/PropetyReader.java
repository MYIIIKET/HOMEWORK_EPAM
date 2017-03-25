package com.mylllket_inc.app;

import com.mylllket_inc.app.Exceptions.NoKeyException;
import com.mylllket_inc.app.Exceptions.NoPropertiesFileException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Properties;

public class PropetyReader {
    private String path;
    private static final String fileType = "properties";
    private HashMap data = null;

    public PropetyReader(String path) throws NoPropertiesFileException {
        Path file = Paths.get(path);
        if (!Files.exists(file))
            throw new NoPropertiesFileException(path);
        else
            this.path = path;
        data = new HashMap();
    }

    public HashMap read() throws IOException, NoKeyException {
        Properties prop = new Properties();
        InputStream input = new FileInputStream(this.path);
        prop.load(input);
        for (int i = 0; i < Key.values().length; i++) {
            if (prop.containsKey(Key.values()[i].getName())) {
                data.put(Key.values()[i].getName(), prop.getProperty(Key.values()[i].getName()));
            } else {
                throw new NoKeyException(Key.values()[i].getName());
            }

        }
        return data;
    }
}
