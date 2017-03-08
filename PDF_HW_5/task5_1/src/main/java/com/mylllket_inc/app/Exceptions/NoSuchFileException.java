package com.mylllket_inc.app.Exceptions;


public class NoSuchFileException extends Exception {
    public NoSuchFileException(String message) {
        super("No such file: " + message);
    }
    public void message(){
        System.out.println("No such file");
    }
}
