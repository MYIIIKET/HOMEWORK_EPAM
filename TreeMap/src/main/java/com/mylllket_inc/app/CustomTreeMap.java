package com.mylllket_inc.app;

import java.util.*;

public class CustomTreeMap<K, V> implements Map<K, V> {
    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(Object key) {
        return false;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        return null;
    }

    public V remove(Object key) {
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        return null;
    }

    private class Node<K, V> implements Iterator<Node<K, V>>, Comparator<Node<K, V>> {

        private final K key;
        private V value;

        private Node left;
        private Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public int compare(Node<K, V> o1, Node<K, V> o2) {
            return 0;
        }

        public boolean hasNext() {
            return false;
        }

        public Node<K, V> next() {
            return null;
        }

        public void remove() {
        }
    }
}
