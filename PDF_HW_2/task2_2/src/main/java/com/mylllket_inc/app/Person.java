package com.mylllket_inc.app;

public class Person implements Stationery {
    private static int id_global = 0;
    private int id;
    private int size = 0;
    private Pen[] list;

    public Person() {
        id_global++;
        id = id_global;
    }

    public void removePen(int index) {
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("PersonID: " + this.id + "| Stationery:\n");
        for (int i = 0; i < this.list.length; i++) {
            result.append("\t\t\t\t\t" + this.list[i].toString() + "\n");
        }
        return result.toString();
    }

    public void setStationery(Pen[] data) {
        size = data.length;
        this.list = data;
    }

    public void add(Pen data) {
        size++;
        Pen[] tmp = new Pen[size];
        System.arraycopy(list, 0, tmp, 0, size - 1);
        tmp[size - 1] = data;
        list = tmp;
    }

}
