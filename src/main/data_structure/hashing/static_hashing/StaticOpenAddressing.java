package main.data_structure.hashing.static_hashing;

import main.data_structure.hashing.interfaces.Hashing;
import main.data_structure.hashing.interfaces.StaticHashing;

public abstract class StaticOpenAddressing implements Hashing, StaticHashing {
    /***
     In this hashing, we must know maximum capacity. because thable
     is static and in each pocket only one value can sit.
     ***/

    private final int capacity;
    private Integer[] pockets;

    public StaticOpenAddressing(int capacity) {
        this.capacity = capacity;
        pockets = new Integer[capacity];
    }

    @Override
    public void insert(int value) {
        int probNumber = 0;
        while (probNumber!=capacity){
            int indexOfValue = hashFunction(value,probNumber);
            if(pockets[indexOfValue] == null){
                pockets[indexOfValue] = value;
                return;
            }
            probNumber++;
        }
    }

    @Override
    public void delete(int value) {
        int probNumber = 0;
        while (probNumber!=capacity){
            int indexOfValue = hashFunction(value,probNumber);
            if(pockets[indexOfValue] == value){
                pockets[indexOfValue] = null;
                return;
            }
            probNumber++;
        }
    }

    @Override
    public int search(int value) {
        int probNumber = 0;
        while (probNumber!=capacity){
            int indexOfValue = hashFunction(value,probNumber);
            if(pockets[indexOfValue] == value){
                return indexOfValue;
            }
            probNumber++;
        }
        return -1;
    }

    public abstract int hashFunction(int value, int probNumber);

    public abstract int hashFunctionPrim(int value);

    public int getCapacity() {
        return capacity;
    }
}
