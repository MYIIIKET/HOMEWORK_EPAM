package com.mylllket_inc.app.Exceptions;


import java.io.FileNotFoundException;

public class NoPropertiesFileException extends FileNotFoundException {
    public NoPropertiesFileException(String message) {
        super("No such file: " + message);
    }

    public void message() {
        System.out.println("No *.properties file");
    }
}
