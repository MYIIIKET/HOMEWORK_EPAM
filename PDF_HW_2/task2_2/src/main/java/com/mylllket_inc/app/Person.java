package com.mylllket_inc.app;

public class Person implements Stationery {
    private static int id_global = 0;
    private int id;
    private Pen[] list;

    public Person() {
        id_global++;
        id = id_global;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PersonID: " + this.id + "| Stationery:\n");
        for (int i = 0; i < this.list.length; i++) {
            result.append("\t" + this.list[i].toString() + "\n");
        }
        return result.toString();
    }

    public void setStationery(Pen[] data) {
        this.list = data;
    }
}
