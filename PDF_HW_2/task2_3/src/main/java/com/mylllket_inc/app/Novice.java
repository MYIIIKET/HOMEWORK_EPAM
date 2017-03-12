package com.mylllket_inc.app;

public class Novice<T extends PenExt> extends Person {

    public static class Builder {
        private Person list = new Person();

        public Builder(ballpointPen p1, gelPen p2, markerPen p3) {
            addPen(p1);
            addPen(p2);
            addPen(p3);
        }

        public Builder addPen(PenExt pen) {
            if (pen instanceof PenExt) {
                list.add(pen);
                return this;
            }
            return null;
        }

        public Novice build() {
            return new Novice(this);
        }
    }

    public Novice(Builder builder) {
        for (int i = 0; i < builder.list.getList().length; i++) {
            this.add(builder.list.getList()[i]);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
