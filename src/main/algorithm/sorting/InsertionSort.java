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
     * Time Complexity ->
     *      best case -> The array is sorted -> O(N)
     *      worth case -> The array is sorted in reverse mode -> O(N^2)
     *
     * insertion sort is an in-place sorting algorithm.
     *
     * @param initialList
     * @return sorted initialList
     */


    @Override
    public int[] sort(int[] initialList) {
        int[] result = initialList.clone();

        for(int currentIndex = 0; currentIndex <initialList.length -1 ; ++currentIndex){
            if(isCurrentValueBiggerThanNext(result, currentIndex)){
                swapCurrentValueAndNext(result, currentIndex);
                placeSmallerValueInSortedSubList(result,currentIndex);
            }
        }
        return result;
    }
    private void swapCurrentValueAndNext(int[] array, int current){
        int flag = array[current];
        array[current] = array[current+1];
        array[current+1] = flag;
    }
    private boolean isCurrentValueBiggerThanNext(int[] array, int currentIndex){
        return array[currentIndex]>array[currentIndex+1];
    }
    private void placeSmallerValueInSortedSubList(int []result, int currentIndex){
        int current = currentIndex;

        while (current!=0){
            if(isCurrentValueSmallerThanBefore(result,current)){
                swapCurrentValueAndBefore(result, current);
                current--;
            }else{
                break;
            }
        }
    }

    private boolean isCurrentValueSmallerThanBefore(int[] array, int currentIndex){
        return array[currentIndex]<array[currentIndex-1];
    }
    private void swapCurrentValueAndBefore(int[] array, int current){
        int flag = array[current];
        array[current] = array[current-1];
        array[current-1] = flag;
    }
}
