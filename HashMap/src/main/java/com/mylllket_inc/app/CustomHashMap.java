package com.mylllket_inc.app;


import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CustomHashMap<K, V> implements Map<K, V> {

    private static final int CAPACITY = 16;
    private int currentSize = 0;

    private CustomEntry<K, V>[] bucket = new CustomEntry[CAPACITY];

    public int size() {
        return currentSize;
    }

    public boolean isEmpty() {
        for (int i = 0; i < CAPACITY; i++) {
            if (bucket[i] != null)
                return true;
        }
        return false;
    }

    public boolean containsKey(Object key) {
        int index = getHash((K) key);
        if(bucket[index]!=null){
            if(bucket[index].getKey().equals(key)){
                return true;
            }
        }
        return false;
    }

    public boolean containsValue(Object value) {
        for (int i = 0; i < CAPACITY; i++) {
            if (bucket[i] != null) {
                CustomEntry tmpBucket = bucket[i];
                while (tmpBucket != null) {
                    if (tmpBucket.getValue().equals(value)) {
                        return true;
                    }
                    tmpBucket = tmpBucket.next();
                }
            }
        }
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

//    public V[] getEntry(K key) {
//    }

    public V put(K key, V value) {
        int index = getHash(key);
        if (bucket[index] == null) {
            bucket[index] = new CustomEntry<K, V>(key, value);
            currentSize++;
            return bucket[index].getValue();
        } else {
            if (bucket[index].getValue() != value) {
                CustomEntry tmpBucket = bucket[index];
                while (tmpBucket.next() != null) {
                    tmpBucket = tmpBucket.next();
                }
                tmpBucket.setNext(new CustomEntry(key, value));
                return bucket[index].next().getValue();
            }
        }
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

    private int getHash(K key) {
        return Math.floorMod(key.hashCode(), CAPACITY);
    }


    private class CustomEntry<K, V> implements Iterator<CustomEntry<K, V>> {
        private final K key;
        private V value;
        private CustomEntry next;

        CustomEntry(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setNext(CustomEntry next) {
            this.next = next;
        }

        public K getKey() {
            return key;
        }


        public boolean hasNext() {
            return next != null;
        }

        public CustomEntry<K, V> next() {
            return this.next;
        }

        public void remove() {
        }
    }
}
