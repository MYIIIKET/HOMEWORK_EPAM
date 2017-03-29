package com.mylllket_inc.app;

import java.util.*;

public class CustomTreeMap<K extends Comparable<K>, V> implements Map<K, V> {

    private Node<K, V> root;
    private int size = 0;
    private boolean direction = false;

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
                node = find(node.left, key);
            } else if (node.getKey().compareTo(key) < 0) {
                node = find(node.right, key);
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

    public boolean getColorByKey(K key) {
        Node result = find(root, key);
        return result.getColor();
    }

    public K getParentByKey(K key) {
        Node result = find(root, key);
        return (result.parent == null) ? null : (K) result.parent.getKey();
    }

    public K getLeftChildByKey(K key) {
        Node result = find(root, key);
        return (result.left == null) ? null : (K) result.left.getKey();
    }

    public K getRightChildByKey(K key) {
        Node result = find(root, key);
        return (result.right == null) ? null : (K) result.right.getKey();
    }

    public boolean isHigher(Node node, K key) {
        Node right = find(node.right, key);
        Node left = find(node.left, key);
        if (right == null) {
            if (left == null) {
                return false;
            }
        }
        return true;
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
            node = balance(node, direction);
            return node;
        } else {
            if (node.getKey().compareTo(key) > 0) {
                direction = false;
                Node tempNode = put(node.left, key, value, node);
                if (isHigher(tempNode, node.getKey())) {
                    node = tempNode;
                } else {
                    node.left = tempNode;
                }
                node = balance(node, direction);
            } else if (node.getKey().compareTo(key) < 0) {
                direction = true;
                Node tempNode = put(node.right, key, value, node);
                if (isHigher(tempNode, node.getKey())) {
                    node = tempNode;
                } else {
                    node.right = tempNode;
                }
                node = balance(node, direction);
            } else {
                node.setValue(value);
            }
        }
        return node;
    }

    private Node<K, V> balance(Node<K, V> node, boolean direction) {
        if (node.parent != null) {
            if (node.parent.parent != null) {

            } else {
                return node;
            }

        } else {
            return node;
        }

        Node uncle = (node.parent.key.compareTo(node.parent.parent.key) > 0) ? node.parent.parent.left : node.parent.parent.right;
        boolean parentColor = node.parent.getColor();
        boolean uncleColor = (uncle != null) ? uncle.getColor() : false;
        boolean nodeColor = node.getColor();
        if (parentColor && uncleColor && nodeColor) {
            node.parent.setColor(false);
            if (node.parent.key.compareTo(node.parent.parent.key) > 0) {
                node.parent.parent.left.setColor(false);
            } else {
                node.parent.parent.right.setColor(false);
            }
            node.parent.parent.setColor(true);
        } else if (parentColor && !uncleColor && nodeColor) {
            if (node.parent.key.compareTo(node.parent.parent.key) > 0) {
                if (direction) {
                    //TODO: When Node added to the right branch as right leaf
                    node.parent.parent.right = node.parent.left;
                    if (node.parent.left != null) {
                        node.parent.left.parent = node.parent.parent;
                    }
                    node.parent.left = node.parent.parent;
                    node.parent.parent = node.parent.left.parent;
                    node.parent.left.parent = node.parent;

                    node.parent.setColor(false);
                    node.parent.left.setColor(true);

                    return node;
                } else {
                    //TODO: When Node added to the right branch as left leaf
                }
            } else {
                if (direction) {
                    //TODO: When Node added to the left branch as right leaf
                } else {
                    //TODO: When Node added to the left branch as left leaf

                    node.parent.parent.left = node.parent.right;
                    if (node.parent.right != null) {
                        node.parent.right.parent = node.parent.parent;
                    }
                    node.parent.right = node.parent.parent;
                    node.parent.parent = node.parent.right.parent;
                    node.parent.right.parent = node.parent;

                    node.parent.setColor(false);
                    node.parent.right.setColor(true);

                    return node;
                }
            }
        }
        return node;
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
