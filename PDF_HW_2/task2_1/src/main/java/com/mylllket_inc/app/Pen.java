package com.mylllket_inc.app;

public class Pen {
    private static int id_global = 0;
    private int id = 0;

    public Pen() {
        id_global++;
        id = id_global;
    }


    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        return this.getClass().getSimpleName().equals(o.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Class: " + this.getClass().getSimpleName() + "| ");
        result.append("ID: " + this.id);
        return result.toString();
    }


}
