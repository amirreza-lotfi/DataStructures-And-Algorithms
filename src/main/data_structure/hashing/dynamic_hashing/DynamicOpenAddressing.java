package main.data_structure.hashing.dynamic_hashing;

import main.data_structure.hashing.interfaces.DynamicHashing;
import main.data_structure.hashing.interfaces.Hashing;

public abstract class DynamicOpenAddressing implements Hashing, DynamicHashing {
    /***
     In this hashing, we must know maximum capacity. because table
     is static and in each pocket only one value can sit.
     ***/

    private int capacity;
    private Integer[] pockets;

    public DynamicOpenAddressing(int capacity) {
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

    @Override
    public void extension() {
        int newCapacity = this.capacity*2;
        Integer[] newArray = new Integer[this.capacity];
        for(int i=0;i<this.capacity;++i){
           insertInto(pockets[i],newArray);
        }
        this.pockets = newArray;
        this.capacity = newCapacity;
    }

    private void insertInto(int value, Integer[] array){
        int probNumber = 0;
        while (probNumber!=array.length){
            int indexOfValue = hashFunction(value,probNumber);
            if(array[indexOfValue] == null){
                array[indexOfValue] = value;
                return;
            }
            probNumber++;
        }
    }

    @Override
    public void compaction() {
        int newCapacity = this.capacity/2;
        Integer[] newArray = new Integer[this.capacity];
        for(int i=0;i<this.capacity;++i){
            insertInto(pockets[i],newArray);
        }
        this.pockets = newArray;
        this.capacity = newCapacity;
    }
}
