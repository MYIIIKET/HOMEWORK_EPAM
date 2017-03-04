package com.mylllket_inc.app;


public interface Stationery<T extends PenExt> {
    public void setStationery(T[] data);
    public void add(T data);
    public void addStationery(T[] data);
}
