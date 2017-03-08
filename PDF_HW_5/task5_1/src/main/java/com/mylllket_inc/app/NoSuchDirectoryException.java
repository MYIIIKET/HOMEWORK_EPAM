package com.mylllket_inc.app;


import java.io.FileNotFoundException;

public class NoSuchDirectoryException extends Exception {
    public NoSuchDirectoryException(String message) {
        super("No such directory: " + message);
    }
}
