package main.data_structure.hashing;

import main.data_structure.hashing.interfaces.StaticHashing;
import main.data_structure.hashing.static_hashing.StaticOpenAddressing;

public class LinearHashing extends StaticOpenAddressing implements StaticHashing {

    public LinearHashing(int capacity) {
        super(capacity);
    }

    @Override
    public int hashFunction(int value, int probNumber) {
        return (int)Math.floor(hashFunctionPrim(value)+probNumber) % super.getCapacity();
    }

    @Override
    public int hashFunctionPrim(int value) {
        return value % super.getCapacity();
    }
}
