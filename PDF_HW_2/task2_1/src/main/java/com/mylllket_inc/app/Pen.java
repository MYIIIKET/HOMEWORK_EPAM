package com.mylllket_inc.app;

/**
 * Class {@link Pen} that contains base methods:
 * <ul>
 * <li>{@link #hashCode()}<li/>
 * <li>{@link #toString()}<li/>
 * <li>{@link #equals(Object)}<li/>
 * <ul/>
 * And fields:
 * <ul>
 * <li>{@value id_global} Identification of all {@link Pen} objects<li/>
 * <li>{@link #id} Identification of current {@link Pen} objects<li/>
 * <ul/>
 */
public class Pen {
    private static int id_global = 0;
    private int id = 0;

    /**
     * Constructor creates {@link Pen} object
     * with specified {@link #id} and
     * increments {@value id_global}
     */
    public Pen() {
        id_global++;
        id = id_global;
    }


    /**
     * Method evaluates some kind of hashCode
     *
     * @return {@link #id}
     */
    @Override
    public int hashCode() {
        return id;
    }

    /**
     * Method check on equality of two {@link Pen} objects.
     * Any other {@link Object} is acceptable
     *
     * @param o Object to compare with
     * @return true if class name and {@link #id} of two objects are the same else false
     */
    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        return this.getClass().getSimpleName().equals(o.getClass().getSimpleName()) && (this.id == ((Pen) o).id);
    }

    /**
     * Method that returns information about {@link Pen} object as {@link String}
     *
     * @return class name and {@link #id}
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Class: " + this.getClass().getSimpleName() + "| ");
        result.append("ID: " + this.id);
        return result.toString();
    }

    /**
     * Method that returns id of current {@link Pen} object
     *
     * @return {@link #id}
     */
    public int getId() {
        return this.id;
    }


}
