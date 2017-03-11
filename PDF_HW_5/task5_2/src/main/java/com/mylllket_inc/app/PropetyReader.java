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
import java.util.Properties;

public class PropetyReader {
    private String path;
    private static final String fileType = "properties";

    public PropetyReader(String path) throws NoPropertiesFileException {
        Path file = Paths.get(path);
        if (!Files.exists(file))
            throw new NoPropertiesFileException(path);
        else
            this.path = path;
    }

    public String read() throws IOException, NoKeyException {
        StringBuilder result = new StringBuilder();
        Properties prop = new Properties();
        InputStream input = new FileInputStream(this.path);
        prop.load(input);
        for (int i = 0; i < Key.values().length; i++) {
            if (prop.containsKey(Key.values()[i].getName()))
                result.append(Key.values()[i].getName() + "=" + prop.getProperty(Key.values()[i].getName()) + "\n");
            else
                throw new NoKeyException(Key.values()[i].getName());
        }
        return result.toString();
    }
}
