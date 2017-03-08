package com.mylllket_inc.app.Exceptions;


import java.io.FileNotFoundException;

public class NoSuchDirectoryException extends Exception {
    public NoSuchDirectoryException(String message) {
        super("No such directory: " + message);
    }

    public void message() {
        System.out.println("No such directory");
    }
}
