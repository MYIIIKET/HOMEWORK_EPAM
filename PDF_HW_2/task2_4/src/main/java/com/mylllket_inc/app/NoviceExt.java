package com.mylllket_inc.app;

public class NoviceExt extends Novice implements Sortable {
    public NoviceExt(Builder builder) {
        super(builder);
    }

    public Novice sortByName() {
        Novice tmp = this;
        System.out.println(tmp.getClass().getSimpleName());
        return null;
    }
}
