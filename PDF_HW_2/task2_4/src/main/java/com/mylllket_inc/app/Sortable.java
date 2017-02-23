package com.mylllket_inc.app;

public interface Sortable<T extends PenExt> {
    NoviceExt sortByName();
    NoviceExt sortByPrice();
    NoviceExt sort();
}
