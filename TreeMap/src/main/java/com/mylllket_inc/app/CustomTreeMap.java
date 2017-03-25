package com.mylllket_inc.app;

import java.util.*;

public class CustomTreeMap<K extends Comparable<K>, V> implements Map<K, V> {

    private Node<K, V> root;
    private Node<K, V> parent;
    private Node<K, V> unckle;
    private boolean direction;
    private boolean[] buf = new boolean[3];
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean containsKey(Object key) {
        Node tmp = find(root, (K) key);
        if (tmp != null)
            return true;
        return false;
    }

    private Node<K, V> find(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        } else {
            if (node.getKey().compareTo(key) > 0) {
                node.left = find(node.left, key);
            } else if (node.getKey().compareTo(key) < 0) {
                node.right = find(node.right, key);
            }
        }
        return node;
    }

    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key) {
        return null;
    }

    public V put(K key, V value) {
        Objects.requireNonNull(key);
        root = put(root, key, value, null);
        root.setColor(false);
        return root.getValue();
    }

    private Node<K, V> put(Node<K, V> node, K key, V value, Node<K, V> parent) {
        if (node == null) {
            size++;
            node = new Node<>(key, value);
            node.parent = parent;
            return node;
        } else {
            if (node.getKey().compareTo(key) > 0) {

                node.left = put(node.left, key, value, node);

                if (node.parent != null) {
                    direction = false;
                    node = balance(node.left, node, node.parent.right, direction);
                }

            } else if (node.getKey().compareTo(key) < 0) {

                node.right = put(node.right, key, value, node);

                if (node.parent != null) {
                    direction = true;
                    node = balance(node.right, node, node.parent.right, direction);
                }
            } else {
                node.setValue(value);
            }
        }
        return node;
    }

    private Node<K, V> balance(Node<K, V> node, Node<K, V> parent, Node<K, V> uncle, boolean direction) {
        boolean parentColor = (parent != null) ? parent.getColor() : false;
        boolean uncleColor = (uncle != null) ? uncle.getColor() : false;
        if (parentColor && uncleColor) {
            parent.setColor(false);
            uncle.setColor(false);
        } else {
            if (parentColor == true && uncleColor == false) {
                if (direction) {
                    node.parent.parent.left = node.right;
                    node.right = node.parent.parent;
                    node.parent.right = node.left;
                    node.left = node.parent;
                    node.parent = node.parent.parent.parent;
                    node.parent.left = node;
                    node.right.parent = node;
                    node.left.parent = node;

                    node.setColor(false);
                    node.right.setColor(true);
                } else {
                    parent.parent.left = parent.right;
                    parent.parent = parent.parent.parent;
                    parent.right = node.parent.parent;
                    node.parent.setColor(false);
                    node.parent.left.setColor(true);
                }
            }
            //TODO: Implement rotation when parent and uncle are different
        }
        return node;
    }

    private boolean[] fillBuf(Node<K, V> node) {
        boolean[] buf = new boolean[3];
        buf[0] = node.getColor();
        if (node.left != null) {
            buf[1] = node.left.getColor();
        }
        if (node.right != null) {
            buf[2] = node.right.getColor();
        }
        return buf;
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

    private class Node<K extends Comparable<K>, V> {

        private final K key;
        private V value;

        private Node parent;
        private Node left;
        private Node right;

        private static final boolean RED = true;
        private static final boolean BLACK = false;

        private boolean color = RED;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }

        public Node getParent() {
            return parent;
        }

        public void setParent(Node parent) {
            this.parent = parent;
        }

        public boolean getColor() {
            return color;
        }

        public void setColor(boolean color) {
            this.color = color;
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
    }

}
