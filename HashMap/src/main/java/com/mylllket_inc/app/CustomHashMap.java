package com.mylllket_inc.app;


import java.util.*;

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
                return false;
        }
        return true;
    }

    public boolean containsKey(Object key) {
        int index = getHash((K) key);
        if (bucket[index] != null) {
            if (bucket[index].getKey().equals(key)) {
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
        int index = getHash((K) key);
        if (bucket[index] != null) {
            return bucket[index].getValue();
        }
        return null;
    }

    public V[] getEntry(K key) {
        int index = getHash((K) key);
        if (bucket[index] != null) {
            if (bucket[index].getKey().equals(key)) {
                int size = getEntrySize(bucket[index]);
                Object[] values = new Object[size];
                CustomEntry tmpBucket = bucket[index];
                for (int i = 0; i < size; i++) {
                    values[i] = tmpBucket.getValue();
                    tmpBucket = tmpBucket.next();
                }
                return (V[]) values;
            }
        }
        return null;
    }

    private int getEntrySize(CustomEntry entry) {
        int size = 0;
        while (entry != null) {
            entry = entry.next();
            size++;
        }
        return size;
    }

    public V put(K key, V value) {
        Objects.requireNonNull(key);
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
        int index = getHash((K) key);
        bucket[index] = null;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> m) {
        for (Map.Entry<? extends K, ? extends V> entry : m.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public void clear() {
        bucket = new CustomEntry[CAPACITY];
        currentSize = 0;
    }

    public Set<K> keySet() {
        return new Set<K>() {
            @Override
            public int size() {
                return currentSize;
            }

            @Override
            public boolean isEmpty() {
                return CustomHashMap.this.isEmpty();
            }

            @Override
            public boolean contains(Object o) {
                return CustomHashMap.this.containsValue(o);
            }

            @Override
            public Iterator<K> iterator() {
                return new Iterator<K>() {
                    int index = 0;

                    @Override
                    public boolean hasNext() {
                        if (index < size()) {
                            return true;
                        }
                        return false;
                    }

                    @Override
                    public K next() {
                        return bucket[++index].getKey();
                    }
                };
            }

            @Override
            public Object[] toArray() {
                Object[] keySet = new Object[currentSize];
                for (int i = 0; i < currentSize; i++) {
                    bucket[i].getKey();
                }
                return keySet;
            }

            @Override
            public <T> T[] toArray(T[] a) {
                Object[] keySet = new Object[currentSize];
                for (int i = 0; i < currentSize; i++) {
                    bucket[i].getKey();
                }
                return (T[]) keySet;
            }

            @Override
            public boolean add(K k) {
                put(k, null);
                return true;
            }

            @Override
            public boolean remove(Object o) {
                CustomHashMap.this.remove(o);
                return true;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                CustomEntry tempEntry;
                for (Object element : c) {
                    for (int i = 0; i < currentSize; i++) {
                        tempEntry = bucket[i];
                        while (tempEntry.hasNext()) {
                            if (!tempEntry.getValue().equals(element)) {
                                return false;
                            }
                        }
                    }
                }
                return true;
            }

            @Override
            public boolean addAll(Collection<? extends K> c) {
                for (Object key : c) {
                    put((K) key, null);
                }
                return true;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                for (int i = 0; i < currentSize; i++) {
                    if (!c.contains(bucket[i].getKey())) {
                        CustomHashMap.this.remove(bucket[i].getKey());
                    }
                }
                return true;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                for (Object key : c) {
                    if (CustomHashMap.this.containsKey(key)) {
                        CustomHashMap.this.remove(key);
                    }
                }
                return true;
            }

            @Override
            public void clear() {
                CustomHashMap.this.clear();
            }
        };
    }

    public Collection<V> values() {
        CustomEntry values = bucket[0];
        List toReturn = new ArrayList();
        while (values.hasNext()) {
            toReturn.add(values.getValue());
            values = values.next;
        }
        return toReturn;
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
