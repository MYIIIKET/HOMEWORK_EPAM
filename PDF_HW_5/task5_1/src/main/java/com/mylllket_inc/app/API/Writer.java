package com.mylllket_inc.app.API;


import com.mylllket_inc.app.Exceptions.NoSuchFileException;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {
    public static void write(String fileName, String text, boolean flag) throws NoSuchFileException, IOException {
        String path = DirectoryExplorer.getCurrentDirectory() + "/" + fileName + "." + DirectoryExplorer.fileType;
        Path file = Paths.get(path);
        if (!Files.exists(file))
            throw new NoSuchFileException(path);

        FileWriter writer = new FileWriter(path, flag);
        writer.write(text);
        writer.flush();
        writer.close();
    }
}
