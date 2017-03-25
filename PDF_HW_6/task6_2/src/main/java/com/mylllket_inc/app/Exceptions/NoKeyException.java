package com.mylllket_inc.app.Exceptions;


public class NoKeyException extends Exception {
    public NoKeyException(String message) {
        super("No such key: " + message);
    }

    public void message() {
        System.out.println("No such key");
    }
}
