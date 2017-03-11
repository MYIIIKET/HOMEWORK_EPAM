package com.mylllket_inc.app;

public class NoviceExt extends Novice implements Sortable {


    private NoviceExt(Builder builder) {
        super(builder);
    }

    public NoviceExt sortByName() {
        this.list = BubbleSort(stack.list, 1);
        return this;
    }

    public NoviceExt sortByPrice() {
        this.list = BubbleSort(stack.list, 2);
        return this;
    }

    public NoviceExt sort() {
        this.list = BubbleSort(stack.list, 3);
        return this;
    }


    protected int getSize() {
        return this.list.length;
    }


    public PenExt[] BubbleSort(PenExt[] data, int param) {
        boolean flag = true;
        PenExt temp;

        while (flag) {
            flag = false;
            switch (param) {
                case 1:
                    for (int j = 0; j < data.length - 1; j++) {
                        if (data[j].getClass().getSimpleName().compareTo(data[j + 1].getClass().getSimpleName()) > 0) {
                            temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;
                            flag = true;
                        }
                    }
                    break;
                case 2:
                    for (int j = 0; j < data.length - 1; j++) {
                        if (data[j].getPrice() > data[j + 1].getPrice()) {
                            temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;
                            flag = true;
                        }
                    }
                    break;
                case 3:
                    for (int j = 0; j < data.length - 1; j++) {
                        if ((data[j].getClass().getSimpleName().compareTo(data[j + 1].getClass().getSimpleName()) > 0) &&
                                (data[j].getPrice() > data[j + 1].getPrice())) {
                            temp = data[j];
                            data[j] = data[j + 1];
                            data[j + 1] = temp;
                            flag = true;
                        }
                    }
                    break;
            }
        }
        return data;
    }

}
