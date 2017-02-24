package com.mylllket_inc.app;


public interface Addable<T> {
    default T[] add(T[] what, T[] where, T data) {
        if (what != null) {
            for (int i = 0; i < what.length; i++) {
                if (what[i].equals(data))
                    return what;
            }
            System.arraycopy(what, 0, where, 0, what.length);
            where[where.length - 1] = data;
            return where;
        } else {
            where[where.length - 1] = data;
            return where;
        }
    }
}
