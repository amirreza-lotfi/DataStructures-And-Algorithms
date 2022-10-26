package main.algorithm.sorting;

import java.util.ArrayList;

public class InsertionSort implements Sorting{

    /**
     * Insertion sort is a simple sorting main.algorithm that works similar to the way you sort
     * playing cards in your hands. The array is virtually split into a sorted and an unsorted
     * part. Values from the unsorted part are picked and placed at the correct position in the
     * sorted part.
     *
     * Time Complexity ->
     * O(N) for converting to arrayList and vice versa.
     * O(N)*O(2N) -> O(N^2) for sorting.
     * so -> O(N+N^2) = O(N^2)
     * Auxiliary Space : O(1)
     *
     * @param initialList
     * @return sorted initialList
     */


    @Override
    public int[] sort(int[] initialList) {
        ArrayList<Integer> result = convertToArrayList(initialList);

        for(int i=1;i<initialList.length;++i){
            placeNumberInSortedSubList(result,i);
        }
        return convertToArray(result);
    }

    private ArrayList<Integer> convertToArrayList(int[] array){
        ArrayList<Integer> result = new ArrayList<>(array.length);
        for (int i=0;i<array.length;++i)
            result.add(array[i]);
        return result;
    }
    private int[] convertToArray(ArrayList<Integer> arrayList){
        int[] a = new int[arrayList.size()];
        for (int i=0;i<a.length;++i)
            a[i] = arrayList.get(i);
        return a;
    }

    private void placeNumberInSortedSubList(ArrayList<Integer> result, int index){
        for(int i=0;i<index;++i){
            if(result.get(i) > result.get(index)){
                int value = result.get(index);
                result.remove(index);
                result.add(i,value);
                break;
            }
        }
    }
}
