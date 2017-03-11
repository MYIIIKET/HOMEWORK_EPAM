package com.mylllket_inc.app;


public enum Key {
    USERNAME("username"), PASSWORD("password"), INFO("info");

    private String name;

    private Key(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
