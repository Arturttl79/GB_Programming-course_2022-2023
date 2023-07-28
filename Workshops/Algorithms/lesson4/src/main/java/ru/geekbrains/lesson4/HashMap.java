package ru.geekbrains.lesson4;

import java.util.Iterator;

public class HashMap<K, V> implements Iterable<HashMap.Entity> {

    private static final int INIT_BUCKET_COUNT = 16;
    private static final double LOAD_FACTOR = 0.5;
    private int size = 0;

    private Bucket[] buckets;

    @Override
    public Iterator<HashMap.Entity> iterator() {
        return new HashMapIterator();
    }

    class HashMapIterator implements Iterator<HashMap.Entity> {
        Bucket<K, V>[] bucks = buckets;
        int index = 0;
        Bucket<K, V> buck = bucks[index];
        Bucket.Node node = buck.head;

        @Override
        public boolean hasNext() {
            // TODO: Подумать головой, ведь это домашнее задание
            return index < bucks.length;
        }

        @Override
        public Entity next() {
            // TODO: Подумать головой, ведь это домашнее задание
            if (!hasNext()) {
                return null;
            } else
                while (true) {
                    if (node != null) {
                        return node.value;
                       //node = node.next;
                    } else {
                        index++;
                        return null;
                    }
                }
        }
    }

    class Entity {
        K key;
        V value;
    }

    class Bucket<K, V> {

        private Node head;

        class Node {
            Node next;
            Entity value;
        }

        public V add(Entity entity) {
            Node node = new Node();
            node.value = entity;

            if (head == null) {
                head = node;
                return null;
            }

            Node currentNode = head;
            while (true) {
                if (currentNode.value.key.equals(entity.key)) {
                    V buf = (V) currentNode.value.value;
                    currentNode.value.value = entity.value;
                    return buf;
                }
                if (currentNode.next != null) {
                    currentNode = currentNode.next;
                } else {
                    currentNode.next = node;
                    return null;
                }
            }

        }

        public V remove(K key) {
            if (head == null)
                return null;
            if (head.value.key.equals(key)) {
                V buf = (V) head.value.value;
                head = head.next;
                return buf;
            } else {
                Node node = head;
                while (node.next != null) {
                    if (node.next.value.key.equals(key)) {
                        V buf = (V) node.next.value.value;
                        node.next = node.next.next;
                        return buf;
                    }
                    node = node.next;
                }
                return null;
            }
        }

        public V get(K key) {
            Node node = head;
            while (node != null) {
                if (node.value.key.equals(key))
                    return (V) node.value.value;
                node = node.next;
            }
            return null;
        }

    }

    private int calculateBucketIndex(K key) {
        return Math.abs(key.hashCode()) % buckets.length;
    }

    private void recalculate() {
        size = 0;
        Bucket<K, V>[] old = buckets;
        buckets = new Bucket[old.length * 2];
        for (int i = 0; i < old.length; i++) {
            Bucket<K, V> bucket = old[i];
            if (bucket != null) {
                Bucket.Node node = bucket.head;
                while (node != null) {
                    put((K) node.value.key, (V) node.value.value);
                    node = node.next;
                }
            }
        }
    }

    public V put(K key, V value) {

        if (buckets.length * LOAD_FACTOR <= size) {
            recalculate();
        }

        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null) {
            bucket = new Bucket();
            buckets[index] = bucket;
        }

        Entity entity = new Entity();
        entity.key = key;
        entity.value = value;

        V res = (V) bucket.add(entity);
        if (res == null) {
            size++;
        }
        return res;
    }

    public V remove(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        V res = (V) bucket.remove(key);
        if (res != null) {
            size--;
        }
        return res;
    }

    public V get(K key) {
        int index = calculateBucketIndex(key);
        Bucket bucket = buckets[index];
        if (bucket == null)
            return null;
        return (V) bucket.get(key);
    }

    public HashMap() {
        buckets = new Bucket[INIT_BUCKET_COUNT];

    }

    public HashMap(int initCount) {
        buckets = new Bucket[initCount];
    }

}
