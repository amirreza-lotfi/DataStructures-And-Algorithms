package main.data_structure.hashing;

import java.util.LinkedList;

public class ChainingHashTable implements StaticHashing {

    /***
     In this hashing, collision solved by using chaining (linkedList).
     ***/

    private int capacity;
    private Node[] pockets;

    public ChainingHashTable(int capacity) {
        this.capacity = capacity;
        pockets = new Node[capacity];
    }

    public int hashFunction(int value) {
        return value % capacity;
    }


    /***
     Time Complexity = O(1)
     ***/
    @Override
    public void insert(int value) {


        int indexOfValue = hashFunction(value);
        pockets[indexOfValue].add(value);
    }

    /***
     Time Complexity : O(n)
     ***/
    @Override
    public void delete(int value) {

        int indexOfValue = hashFunction(value);
        pockets[indexOfValue].delete(value);
    }

    /***
     Time Complexity : O(n)
     ***/
    @Override
    public int search(int value) {

        int indexOfValue = hashFunction(value);
        if (pockets[indexOfValue].find(value) == -1)
            return indexOfValue;
        else
            return -1;
    }
}
