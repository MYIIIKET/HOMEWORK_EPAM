package com.mylllket_inc.app;

public class Novice extends Person {


    protected static Person stack = new Person();


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

        for (int i = 0; i < stack.list.length; i++) {
            if (stack.list[i] instanceof ballpointPen)
                this.add(stack.list[i]);
            if (stack.list[i] instanceof gelPen)
                this.add(stack.list[i]);
            if (stack.list[i] instanceof markerPen)
                this.add(stack.list[i]);
            if (stack.list[i] instanceof biopolymericPen)
                this.add(stack.list[i]);
            if (stack.list[i] instanceof capillaryPen)
                this.add(stack.list[i]);
            if (stack.list[i] instanceof fountainPen)
                this.add(stack.list[i]);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
