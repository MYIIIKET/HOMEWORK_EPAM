package com.mylllket_inc.app.API;


import com.mylllket_inc.app.Exceptions.NoSuchFileException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Reader {


    public static String read(String fileName) throws IOException, NoSuchFileException {
        String path = DirectoryExplorer.getCurrentDirectory() + "/" + fileName + "." + DirectoryExplorer.fileType;
        Path file = Paths.get(path);
        if (!Files.exists(file))
            throw new NoSuchFileException(path);

        FileReader reader = new FileReader(path);
        StringBuilder result = new StringBuilder();
        int data;
        while ((data = reader.read()) != -1) {
            result.append((char) data);
        }
        reader.close();
        return result.toString();
    }

    private static String getFileExtension(String path) {
        File file = new File(path);
        String fileName = file.getName();
        if (fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
            return fileName.substring(fileName.lastIndexOf(".") + 1);
        else return "";
    }
}
