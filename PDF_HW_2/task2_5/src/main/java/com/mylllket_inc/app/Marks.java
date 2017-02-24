package com.mylllket_inc.app;


import java.util.List;

public interface Marks<T extends Number> {
    void addMark(T data);
    List getMarks();
}
