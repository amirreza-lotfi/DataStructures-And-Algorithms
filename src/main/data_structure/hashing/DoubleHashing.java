package main.data_structure.hashing;

import main.data_structure.hashing.interfaces.StaticHashing;
import main.data_structure.hashing.static_hashing.StaticOpenAddressing;

public class DoubleHashing extends StaticOpenAddressing implements StaticHashing {

    private final int mPrim;
    public DoubleHashing(int capacity, int mPrim) {
        super(capacity);
        this.mPrim = mPrim;
    }
    public DoubleHashing(int capacity) {
        super(capacity);
        this.mPrim=capacity-1;
    }



    @Override
    public int hashFunction(int value, int probNumber) {
        return (int)Math.floor(hashFunctionPrim(value) + probNumber*hashDoublePrim(value)) % super.getCapacity();
    }

    @Override
    public int hashFunctionPrim(int value) {
        return value % super.getCapacity();
    }

    public int hashDoublePrim(int value){
        return 1 + value % mPrim;
    }

}
