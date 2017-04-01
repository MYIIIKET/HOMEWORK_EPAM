package com.mylllket_inc.app;


import java.util.*;

public class CustomArrayList<T> implements List<T> {

    public static final int CAPACITY = 10;
    private Object[] data = new Object[CAPACITY];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(Object o) {
        Objects.requireNonNull(o);
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return (index >= 0 && index < size) ? true : false;
            }

            @Override
            public T next() {
                return (index + 1 < size) ? (T) data[++index] : null;
            }
        };
    }

    public Object[] toArray() {
        Object[] newData = new Object[size];
        System.arraycopy(data, 0, newData, 0, size);
        return newData;
    }

    public <T1> T1[] toArray(T1[] a) {
        return (T1[]) CustomArrayList.this.toArray();
    }

    public boolean add(T t) {
        Objects.requireNonNull(t);
        if (size >= data.length) {
            data = Arrays.copyOf(data, ((data.length * 3) / 2) + 1);
            add(t);
        } else {
            data[size++] = t;
        }
        return true;
    }

    public boolean remove(Object o) {
        Objects.requireNonNull(o);
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                remove(i);
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        Objects.requireNonNull(c);
        for (Object value : c) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends T> c) {
        Objects.requireNonNull(c);
        for (Object value : c) {
            add((T) value);
        }
        return true;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        Objects.requireNonNull(c);
        for (Object value : c) {
            add(index, (T) value);
        }
        return true;
    }

    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        for (Object value : c) {
            if (contains(value)) {
                remove(value);
            }
        }
        return true;
    }

    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        for (int i = 0; i < size; i++) {
            if (!c.contains(data[i])) {
                remove(i);
            }
        }
        return true;
    }

    public void clear() {
        data = new Object[CAPACITY];
        size = 0;
    }

    public T get(int index) {
        if (index < 0 || index > data.length)
            return null;
        return (T) data[index];
    }

    public T set(int index, T element) {
        Objects.requireNonNull(element);
        if (index <= 0 || index > data.length) {
            if (data[index] != null) {
                data[index] = element;
            } else {
                return null;
            }
        }
        return (T) (((index - 1) < 0) ? data[index] : data[index - 1]);
    }

    public void add(int index, T element) {
        Objects.requireNonNull(element);
        if (index >= 0 || index < data.length) {
            Object[] firstPart = Arrays.copyOfRange(data, 0, index);
            Object[] secondPart = Arrays.copyOfRange(data, index, data.length);
            Object[] finalPart = new Object[size + 1];
            data = firstPart;
            size = data.length;
            add(element);
            System.arraycopy(data, 0, finalPart, 0, size);
            System.arraycopy(secondPart, 0, finalPart, size, secondPart.length);
            data = finalPart;
            size = firstPart.length + secondPart.length + 1;
        }
    }

    public T remove(int index) {
        int length = data.length - index;
        T value = (T) data[index];
        System.arraycopy(data, index + 1, data, index, length - 1);
        size--;
        return value;
    }

    public int indexOf(Object o) {
        Objects.requireNonNull(o);
        for (int i = 0; i < size; i++) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        Objects.requireNonNull(o);
        for (int i = size - 1; i >= 0; i--) {
            if (data[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator(int index) {
        return new ListIterator<T>() {
            private int innerIndex = index;

            @Override
            public boolean hasNext() {
                return (innerIndex < size) ? true : false;
            }

            @Override
            public T next() {
                return (innerIndex > 0 && innerIndex < size) ? (T) data[++innerIndex] : null;
            }

            @Override
            public boolean hasPrevious() {
                return (innerIndex > 0) ? true : false;
            }

            @Override
            public T previous() {
                return (innerIndex > 0) ? (T) data[--innerIndex] : null;
            }

            @Override
            public int nextIndex() {
                return ++innerIndex;
            }

            @Override
            public int previousIndex() {
                return --innerIndex;
            }

            @Override
            public void remove() {
                CustomArrayList.this.remove(innerIndex);
            }

            @Override
            public void set(T t) {
                CustomArrayList.this.set(innerIndex, t);
            }

            @Override
            public void add(T t) {
                CustomArrayList.this.add(innerIndex, t);
            }
        };
    }

    public List<T> subList(int fromIndex, int toIndex) {
        if (fromIndex > toIndex || fromIndex < 0 || toIndex > size) {
            return null;
        }
        CustomArrayList newData = new CustomArrayList();
        for (int i = fromIndex; i < toIndex; i++) {
            newData.add(data[i]);
        }
        return newData;
    }
}
