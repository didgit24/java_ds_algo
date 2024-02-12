package com.algo.hashtable;

import java.lang.reflect.Array;
public class HashTableDemo {
    public static void main(String[] args) {
        HashTableDemo test = new HashTableDemo();
        HashTable hashTable = test.new HashTable(3);

        hashTable.add("alpha", "zeta");
        hashTable.add("beta", "theta");
        hashTable.add("gamma", "tau");
        System.out.println(hashTable.get("alpha"));
        System.out.println(hashTable.get("beta"));
        System.out.println(hashTable.get("gamma"));

        hashTable.remove("beta");
        System.out.println(hashTable.get("beta"));

        hashTable.add("beta", "theta");
        System.out.println(hashTable.get("beta"));
    }
public class HashTable {

    // known limitation: This will break if the key value
    // is set to none because I
    // use none as the identifier string for deleted keys.
    private int capacity;
    String values[];
    String keys[];

    public HashTable(int capacity) {
        this.capacity = capacity;
        values = new String[this.capacity];
        keys = new String[this.capacity];
    }

    public int hash(String key) {
        int sum = 0;
        for (int i = 0; i < key.length(); i++) {
            sum += key.charAt(i);
        }
        return sum % capacity;
    }

    public void add(String key, String value) {
        int keyhash;
        int i = 0;
        while (i != capacity - 1) {
            keyhash = (hash(key) + i) % capacity;
            if (values[keyhash] == null ||
                    values[keyhash].equals("none")) {
                // add delete flag to this condition
                // after implementing delete.
                values[keyhash] = value;
                keys[keyhash] = key;
                break;
            }

            if (values[keyhash] != null &&
                    keys[keyhash].equals(key)) {
                values[keyhash] = value;
                break;
            }
            i++;
        }
        if (i == capacity - 1) {
            String text = "Table appears to be full, "
                    + "unable to insert value";
            throw new ArrayIndexOutOfBoundsException(text);
        }
    }

    public String get(String key) {
        int i = 0;
        int keyhash = (hash(key) + i) % capacity;
        while (values[keyhash] != null && i < capacity) {
            if (keys[keyhash].equals(key))
                return values[keyhash];
            i++;
            keyhash = (hash(key) + i) % capacity;
        }
        return null;
    }

    public void remove(String key) {
        int i = 0;
        int keyhash = (hash(key) + i) % capacity;
        while (keys[keyhash] != null && i < capacity) {
            if (keys[keyhash].equals(key)) {
                keys[keyhash] = "none";
                values[keyhash] = "none";
                return;
            }
            i++;
            keyhash = (hash(key) + i) % capacity;
        }
        String text = "Key does not exist in table";
        throw new IllegalArgumentException(text);
    }

    public String[] getHashedValues() {
        return values;
    }
    }
}
