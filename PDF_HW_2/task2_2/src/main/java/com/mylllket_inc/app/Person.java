package com.mylllket_inc.app;

public class Person<T extends PenExt> implements Stationery<T> {
    private static int id_global = 0;
    private int id;
    private int size = 0;
    private PenExt[] list;

    public Person() {
        id_global++;
        id = id_global;
    }

    public String toString() {
        int sumPrice = 0;
        StringBuilder result = new StringBuilder();
        result.append("PersonID: " + this.id + "| Stationery:\n");
        for (int i = 0; i < this.list.length; i++) {
            result.append("\t\t\t\t\t" + this.list[i].toString() + "\n");
            sumPrice += this.list[i].getPrice();
        }
        result.append("Sum: " + sumPrice + "\n");
        return result.toString();
    }


    public void setStationery(T[] data) {
        size = data.length;
        this.list = data;
    }

    public void add(T data) {
        if (this.list != null) {
            for (int i = 0; i < list.length; i++) {
                if (list[i].equals(data))
                    return;
            }
            size++;
            PenExt[] tmp = new PenExt[size];
            System.arraycopy(list, 0, tmp, 0, size - 1);
            tmp[size - 1] = data;
            this.list = tmp;
        } else {
            size++;
            list = new PenExt[size];
            list[size - 1] = data;
        }
    }

    public void addStationery(T[] data) {
        for (int i = 0; i < data.length; i++) {
            this.add(data[i]);
        }
    }

    public boolean contains(T data) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(data))
                return true;
        }
        return false;
    }

    public PenExt[] getList() {
        return list;
    }

}
