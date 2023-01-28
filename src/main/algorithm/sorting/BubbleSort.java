package main.algorithm.sorting;

public class BubbleSort implements Sorting{

    /**
     * Bubble Sort is the simplest sorting main.algorithm that works by repeatedly swapping the
     * adjacent elements if they are in the wrong order. This main.algorithm is not suitable for
     * large data sets as its average and worst case time complexity is quite high.
     *
     * The above function always runs O(n^2) time even if the array is sorted.
     * It can be optimized by stopping the main.algorithm if the inner loop didn't cause any swap.
     *
     * The worst-case condition for bubble sort occurs when elements of the array
     * are arranged in decreasing order -> O(N^2).
     *
     * The best-case condition for bubble sort occurs when elements of the array
     * are arranged in decreasing order -> O(N).
     *
     * The bubble sort algorithm is stable and in-place but it is not adaptive.
     * @param initialList
     * @return sorted of initialList
     */

    @Override
    public int[] sort(int[] initialList) {
        int[] result = initialList.clone();
        for(int n=0;n<result.length;++n){
            boolean theArrayIsSorted = true;

            for(int first=0;first<result.length-1;first++){
                if(result[first] > result[first+1]) {
                    swap(result, first, first + 1);
                    theArrayIsSorted = false;
                }
            }

            if(theArrayIsSorted) break;
        }
        return result;
    }

    private void swap(int[] array, int first, int second){
        int flag = array[first];
        array[first] = array[second];
        array[second] = flag;
    }

}
