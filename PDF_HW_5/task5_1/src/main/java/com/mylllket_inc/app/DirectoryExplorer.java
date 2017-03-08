package com.mylllket_inc.app;


import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryExplorer extends Throwable {
    private static String currentDirectory = System.getProperty("user.dir");

    public static String getCurrentDirectory() {
        return currentDirectory;
    }

    public static String getCurrentDirectoryList() {
        StringBuilder result = new StringBuilder();

        File dir = new File(currentDirectory);
        File[] filesList = dir.listFiles();
        for (File file : filesList) {
            if (file.isFile()) {
                result.append("FILE\t\t" + file.getName() + "\n");
                continue;
            }
            if (file.isDirectory()) {
                result.append("DIRECTORY\t" + file.getName() + "\n");
                continue;
            }
        }
        return result.toString();
    }

    public static boolean setCurrentDirectory(String path) throws NoSuchDirectoryException {
        Path directory = setPath(path);
        if (!Files.exists(directory) || !Files.isDirectory(directory)) {
            throw new NoSuchDirectoryException(directory.toString());
        } else currentDirectory = directory.toString();
        return true;
    }

    private static Path setPath(String path) {
        Path tmpPath;
        if (path.equals("../")) {
            tmpPath = Paths.get(currentDirectory).getParent();
        } else if (Paths.get(path).getRoot() != null) {
            System.setProperty("user.dir", path);
            tmpPath = Paths.get(System.getProperty("user.dir"));
        } else {
            tmpPath = Paths.get(System.getProperty("user.dir") + "/" + path);
        }
        return tmpPath;
    }
}
