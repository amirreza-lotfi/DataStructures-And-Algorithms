package main.data_structure.hashing;

import main.data_structure.hashing.interfaces.StaticHashing;
import main.data_structure.hashing.static_hashing.StaticOpenAddressing;

public class QuadraticHashing extends StaticOpenAddressing implements StaticHashing {
    private final int c1;
    private final int c2;

    public QuadraticHashing(int capacity, int c1, int c2) {
        super(capacity);
        this.c1 = c1;
        this.c2 = c2;
    }


    @Override
    public int hashFunction(int value, int probNumber) {
        return (int)Math.floor(hashFunctionPrim(value)+c1*probNumber+c2*(probNumber*probNumber)) % super.getCapacity();
    }

    @Override
    public int hashFunctionPrim(int value) {
        return value % super.getCapacity();
    }
}
