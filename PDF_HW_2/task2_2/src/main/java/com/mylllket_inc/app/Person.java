package com.mylllket_inc.app;

/**
 * Class {@link Person} that can store {@link PenExt}
 * Methods:
 * <ul>
 * <li>{@link #toString()}<li/>
 * <li>{@link #add(PenExt)}<li/>
 * <li>{@link #addStationery(PenExt[])}<li/>
 * <li>{@link #setStationery(PenExt[])}<li/>
 * <li>{@link #getList()}<li/>
 * <li>{@link #contains(PenExt)}<li/>
 * <ul/>
 * Fields:
 * <ul>
 * <li>{@value #id_global} identification of all {@link Person} objects<li/>
 * <li>{@link #id} identification of current {@link Person} oject<li/>
 * <li>{@link #size} size of the current {@link #list} object<li/>
 * <li>{@link #list} contains all {@link PenExt} objects<li/>
 * <ul/>
 *
 * @param <T> Prevent adding different objects except {@link PenExt}
 */
public class Person<T extends PenExt> implements Stationery<T> {
    private static int id_global = 0;
    private int id;
    private int size = 0;
    private PenExt[] list;

    /**
     * Constructor creates {@link Person} object
     * with specified {@link #id}
     * and increments {@link #id_global}
     */
    public Person() {
        id_global++;
        id = id_global;
    }

    /**
     * Returns information about current {@link Person} object as {@link String}
     *
     * @return {@link String} object
     */
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


    /**
     * Set new {@link PenExt} objects to current {@link Person}
     *
     * @param data array of {@link PenExt} objects
     */
    public void setStationery(T[] data) {
        size = data.length;
        this.list = (PenExt[]) data;
    }

    /**
     * Add new {@link PenExt} object to {@link Person}
     *
     * @param data object of {@link PenExt}
     */
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

    /**
     * Add array of {@link PenExt} objects to current {@link Person}
     *
     * @param data array of {@link PenExt} objects
     */
    public void addStationery(T[] data) {
        for (int i = 0; i < data.length; i++) {
            this.add(data[i]);
        }
    }

    /**
     * Check if {@link Person} contains {@link PenExt} object
     *
     * @param data object of {@link PenExt}
     * @return true if {@link Person} has given {@link PenExt} object else false
     */
    public boolean contains(T data) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(data))
                return true;
        }
        return false;
    }

    /**
     * Returns array of {@link PenExt} objects
     *
     * @return array of {@link PenExt} objects
     */
    @Override
    public PenExt[] getList() {
        return this.list;
    }

}
