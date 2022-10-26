package main.algorithm.searching;

public class LinearSearch implements SearchingI{

    /**
     * It is the simplest searching main.algorithm. iterate array and if value of array equal to input,
     * it returns index.
     * Time complexity: O(N)
     * Auxiliary Space: O(1)
     *
     * @param array the given array.
     * @param value the value that we want find it in array.
     * @return index of value in array.
     */
    @Override
    public int search(int[] array, int value) {
        for(int i=0;i<array.length;++i){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
