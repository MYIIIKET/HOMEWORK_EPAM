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
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T1> T1[] toArray(T1[] a) {
        return null;
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
        for (int i = 0; i < data.length; i++) {
            if (data[i].equals(o)) {
                remove(i);
            }
        }
        return false;
    }

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    public boolean removeAll(Collection<?> c) {
        return false;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public void clear() {
        data = new Object[CAPACITY];
        size = 0;
    }

    public T get(int index) {
        if (index <= 0 || index > data.length)
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
        return null;
    }

    public ListIterator<T> listIterator(int index) {
        return null;
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
