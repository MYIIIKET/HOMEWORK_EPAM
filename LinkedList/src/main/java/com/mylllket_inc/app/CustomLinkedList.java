package com.mylllket_inc.app;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomLinkedList<T> implements List<T> {
    Node<T> head = new Node<T>(null);
    private int size = 0;

    public int size() {
        size = 0;
        Node tempNode = head;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            size++;
        }
        return size;
    }

    public boolean isEmpty() {
        return !head.hasNext();
    }

    public boolean contains(Object o) {
        Node tempNode = head;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            if (tempNode.value.equals(o)) {
                return true;
            }
        }
        return false;
    }

    public Iterator<T> iterator() {
        //TODO: implement Iterator
        return null;
    }

    public Object[] toArray() {
        Object[] array = new Object[size()];
        Node tempNode = head;
        int i = 0;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            array[i] = tempNode.value;
            i++;
        }
        return array;
    }

    public <T1> T1[] toArray(T1[] a) {
        head = new Node<T>(null);
        head.next = null;
        head.prev = null;
        for (int i = 0; i < a.length; i++) {
            //TODO: Array to linkedList
        }
        return null;
    }

    public boolean add(T t) {
        Node tempNode = head;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            if (tempNode.value.equals(t)) {
                return false;
            }
        }
        tempNode.next = new Node(t);
        tempNode.next.prev = tempNode;
        return true;
    }

    public boolean remove(Object o) {
        Node tempNode = head;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            if (tempNode.value.equals(o)) {
                tempNode.prev.next = tempNode.next;
                if (tempNode.hasNext()) {
                    tempNode.next.prev = tempNode.prev;
                }
                return true;
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

    }

    public T get(int index) {
        return null;
    }

    public T set(int index, T element) {
        return null;
    }

    public void add(int index, T element) {

    }

    public T remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
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

    private class Node<T> {
        private Node<T> next;
        private Node<T> prev;
        private T value;

        public Node(T value) {
            this.value = value;
        }

        public boolean hasNext() {
            return next != null;
        }
    }
}
