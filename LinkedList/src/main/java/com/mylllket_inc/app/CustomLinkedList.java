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
        head = new Node<T>(null);
    }

    public T get(int index) {
        if (index >= 0 && index <= size()) {
            Node tempNode = head;
            int i = 0;
            while (i != index) {
                if (!tempNode.hasNext()) {
                    return null;
                } else {
                    tempNode = tempNode.next;
                    i++;
                }
            }
            return (T) tempNode.value;
        }
        return null;
    }

    public T set(int index, T element) {
        if (get(index) != null) {
            Node tempNode = head;
            while (index > 0) {
                tempNode = tempNode.next;
                index--;
            }
            return (T) (tempNode.value = element);
        }
        return null;
    }

    public void add(int index, T element) {
        if (get(index) != null) {
            Node tempNode = head;
            while (index > 0) {
                tempNode = tempNode.next;
                index--;
            }
            Node newNode = new Node(element);
            tempNode.prev.next = newNode;
            newNode.prev = tempNode.prev;
            newNode.next = tempNode;
            tempNode.prev = newNode;
        }
    }

    public T remove(int index) {
        if (get(index) != null) {
            Node tempNode = head;
            while (index > 0) {
                tempNode = tempNode.next;
                index--;
            }
            tempNode.prev.next = tempNode.next;
            tempNode.next.prev = tempNode.prev;
            tempNode.prev = null;
            tempNode.next = null;
            return (T) tempNode.value;
        }
        return null;
    }

    public int indexOf(Object o) {
        Node tempNode = head;
        int index = 0;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
            if (tempNode.value.equals(o)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int lastIndexOf(Object o) {
        int index = size();
        Node tempNode = head;
        while (tempNode.hasNext()) {
            tempNode = tempNode.next;
        }
        while (index >= 0 && tempNode.prev != null) {
            if (tempNode.value.equals(o)) {
                return index;
            }
            index--;
            tempNode = tempNode.prev;
        }
        return -1;
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public ListIterator<T> listIterator(final int index) {

        return new ListIterator<T>() {

            private int pointer = index + 1;

            public boolean hasNext() {
                if (get(pointer) != null) {
                    return getNode(pointer).hasNext();
                }
                return false;
            }

            public T next() {
                return getNode(pointer).next.value;
            }

            public boolean hasPrevious() {
                return getNode(pointer).hasPrev();
            }

            public T previous() {
                return getNode(pointer).prev.value;
            }

            public int nextIndex() {
                return pointer + 1;
            }

            public int previousIndex() {
                return pointer - 1;
            }

            public void remove() {
                CustomLinkedList.this.remove(pointer);
                pointer = pointer - 1;
            }

            public void set(T t) {
                CustomLinkedList.this.set(pointer + 1, t);
            }

            public void add(T t) {
                CustomLinkedList.this.add(t);
            }
        };
    }

    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

    private Node<T> getNode(int index) {
        if (get(index) != null) {
            Node tempNode = head;
            while (index > 0) {
                tempNode = tempNode.next;
                index--;
            }
            return tempNode;
        }
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

        public boolean hasPrev() {
            return prev != null;
        }
    }
}
