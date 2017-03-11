package com.mylllket_inc.app;

public class Novice<T extends PenExt> extends Person {


    private static Person stack = new Person();

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
        for (int i = 0; i < stack.getList().length; i++) {
            this.add(stack.getList()[i]);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
