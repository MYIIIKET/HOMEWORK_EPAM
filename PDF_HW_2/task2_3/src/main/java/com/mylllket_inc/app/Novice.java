package com.mylllket_inc.app;

public class Novice extends Person {


    private ballpointPen[] ballpointPen = null;
    private biopolymericPen[] biopolymericPen = null;
    private capillaryPen[] capillaryPen = null;
    private fountainPen[] fountainPen = null;
    private gelPen[] gelPen = null;
    private markerPen[] markerPen = null;

    public static class Builder {

        private ballpointPen[] ballpointPen = new ballpointPen[1];
        private int bsize = 1;
        private gelPen[] gelPen = new gelPen[1];
        private int gsize = 1;
        private markerPen[] markerPen = new markerPen[1];
        private int msize = 1;

        private biopolymericPen[] biopolymericPen = null;
        private int bpsize = 0;
        private capillaryPen[] capillaryPen = null;
        private int csize = 0;
        private fountainPen[] fountainPen = null;
        private int fsize = 0;


        public Builder(ballpointPen p1, gelPen p2, markerPen p3) {
            ballpointPen[0] = p1;
            gelPen[0] = p2;
            markerPen[0] = p3;
        }

        public Builder ballpointPen(ballpointPen pen) {
            bsize++;
            ballpointPen[] tmp = new ballpointPen[bsize];
            if (ballpointPen != null)
                System.arraycopy(ballpointPen, 0, tmp, 0, bsize - 1);
            tmp[bsize - 1] = pen;
            ballpointPen = tmp;
            return this;
        }

        public Builder biopolymericPen(biopolymericPen pen) {
            bpsize++;
            biopolymericPen[] tmp = new biopolymericPen[bpsize];
            if (biopolymericPen != null)
                System.arraycopy(biopolymericPen, 0, tmp, 0, bpsize - 1);
            tmp[bpsize - 1] = pen;
            biopolymericPen = tmp;
            return this;
        }

        public Builder capillaryPen(capillaryPen pen) {
            csize++;
            capillaryPen[] tmp = new capillaryPen[csize];
            if (capillaryPen != null)
                System.arraycopy(capillaryPen, 0, tmp, 0, csize - 1);
            tmp[csize - 1] = pen;
            capillaryPen = tmp;
            return this;
        }

        public Builder fountainPen(fountainPen pen) {
            fsize++;
            fountainPen[] tmp = new fountainPen[fsize];
            if (fountainPen != null)
                System.arraycopy(fountainPen, 0, tmp, 0, fsize - 1);
            tmp[fsize - 1] = pen;
            fountainPen = tmp;
            return this;
        }

        public Builder gelPen(gelPen pen) {
            gsize++;
            gelPen[] tmp = new gelPen[gsize];
            if (gelPen != null)
                System.arraycopy(gelPen, 0, tmp, 0, gsize - 1);
            tmp[gsize - 1] = pen;
            gelPen = tmp;
            return this;
        }

        public Builder markerPen(markerPen pen) {
            msize++;
            markerPen[] tmp = new markerPen[msize];
            if (markerPen != null)
                System.arraycopy(markerPen, 0, tmp, 0, msize - 1);
            tmp[msize - 1] = pen;
            markerPen = tmp;
            return this;
        }

        public Novice build() {
            return new Novice(this);
        }
    }

    private Novice(Builder builder) {
        this.ballpointPen = builder.ballpointPen;
        this.biopolymericPen = builder.biopolymericPen;
        this.capillaryPen = builder.capillaryPen;
        this.fountainPen = builder.fountainPen;
        this.gelPen = builder.gelPen;
        this.markerPen = builder.markerPen;

        this.addStationery(ballpointPen);
        this.addStationery(gelPen);
        this.addStationery(markerPen);

        if (biopolymericPen != null)
            this.addStationery(biopolymericPen);
        if (capillaryPen != null)
            this.addStationery(capillaryPen);
        if (fountainPen != null)
            this.addStationery(fountainPen);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
