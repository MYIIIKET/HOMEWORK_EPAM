package com.mylllket_inc.app;

public class Novice<T extends PenExt> extends Person {


    protected static Person stack = new Person();
    private PenExt[] list;


    public static class Builder {


        public Builder(ballpointPen p1, gelPen p2, markerPen p3) {
            addPen(p1);
            addPen(p2);
            addPen(p3);
        }

        public Builder addPen(PenExt pen) {
            if (pen instanceof PenExt) {
                stack.add(pen);
                return this;
            }

            return null;
        }


        public Novice build() {
            return new Novice(this);
        }
    }

    protected Novice(Builder builder) {
        this.list = stack.getList();
        for (int i = 0; i < list.length; i++) {
            this.add(list[i]);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
