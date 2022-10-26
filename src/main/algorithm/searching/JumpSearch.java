package main.algorithm.searching;

public class JumpSearch implements SearchingI {
    /**
     * Like Binary Search, Jump Search is a searching main.algorithm for sorted arrays.
     * The basic idea is to check fewer elements (than linear search) by jumping ahead
     * by fixed steps or skipping some elements in place of searching all elements.
     * <p>
     * Time Complexity: O( (n/sqrt(n)) + sqrt(n)-1)
     * Auxiliary Space: O(1)
     *
     * @param array given sorted array.
     * @param value value that we want to find in array.
     * @return index of value
     */
    @Override
    public int search(int[] array, int value) {
        int block = (int) Math.sqrt(array.length);
        int low = 0;
        int high = block;

        while (true) {
            if(high>=array.length){
                //linear search

                for(int i=low;i<array.length;++i)
                    if (value==array[i]) return i;
                return -1;
            }else if(array[high]>value){
                //linear search

                for(int i=low;i<high;++i)
                    if (value==array[i]) return i;
                return -1;
            }


            if (array[low] == value)
                return low;
            if (array[high] == value)
                return high;

            low+=block;
            high+=block;
        }
    }
}
