package test.algorithms.sorting;

import main.algorithm.sorting.SelectionSort;
import main.algorithm.sorting.Sorting;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortTest {
    private Sorting selectionSort = new SelectionSort();

    @Test
    public void sortingTest1(){
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},selectionSort.sort(numbers));
    }
    @Test
    public void sortingTest2(){
        int[] numbers = new int[]{9,8,7,6,5,4,3,2,1};
        assertArrayEquals(selectionSort.sort(numbers),new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void sortingTest3(){
        int[] numbers = new int[]{9,9,9,1,1,1,8,8,8};
        assertArrayEquals(selectionSort.sort(numbers),new int[]{1,1,1,8,8,8,9,9,9});
    }


}