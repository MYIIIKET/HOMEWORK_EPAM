package com.mylllket_inc.app;

/**
 * Created by mylll on 23.02.2017.
 */
public interface Stationery<T extends PenExt> {
    public void setStationery(T[] data);
    public void add(T data);
    public void addStationery(T[] data);
}
