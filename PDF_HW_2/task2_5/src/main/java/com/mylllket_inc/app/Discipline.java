package com.mylllket_inc.app;


import java.util.ArrayList;
import java.util.List;

public enum Discipline implements Marks {
    PROPERTY_PROTECTION {
        private List<Integer> mark = new ArrayList<Integer>();
        private int size = 0;

        @Override
        public void addMark(Number data) {
            if (data.doubleValue() < 0 || data.doubleValue() > 5)
                return;
            mark.add(data.intValue());
        }

        @Override
        public List getMarks() {
            return mark;
        }

    },
    HARDWARE_AND_SOFTWARE_DATA_PROTECTION {
        private List<Float> mark = new ArrayList<Float>();;
        private int size = 0;

        @Override
        public void addMark(Number data) {
            if (data.doubleValue() < 0 || data.doubleValue() > 5)
                return;
            mark.add(data.floatValue());
        }

        @Override
        public List getMarks() {
            return mark;
        }
    },
    CRYPTOGRAPHIC_METHODS_OF_INFORMATION_PROTECTION {
        private List<Double> mark = new ArrayList<Double>();;
        private int size = 0;

        @Override
        public void addMark(Number data) {
            if (data.doubleValue() < 0 || data.doubleValue() > 5)
                return;
            mark.add(data.doubleValue());
        }

        @Override
        public List getMarks() {
            return mark;
        }
    },
    MODELING {
        private List<Long> mark = new ArrayList<Long>();;
        private int size = 0;

        @Override
        public void addMark(Number data) {
            if (data.doubleValue() < 0 || data.doubleValue() > 5)
                return;
            mark.add(data.longValue());
        }

        @Override
        public List getMarks() {
            return mark;
        }
    };

}
