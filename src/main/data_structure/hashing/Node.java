package main.data_structure.hashing;

import java.util.LinkedList;

public class Node {
    private LinkedList<Integer> values = new LinkedList<>();
    public void add(int value){
        values.addFirst(value);
    }
    public void delete(int value){
        values.remove(value);
    }
    public int find(int value){
        for (int number : values) {
            if(number == value){
                return value;
            }
        }
        return -1;
    }
}
