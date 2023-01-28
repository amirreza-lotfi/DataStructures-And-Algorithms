package test.algorithms.sorting;

import main.algorithm.sorting.InsertionSort;
import main.algorithm.sorting.SelectionSort;
import main.algorithm.sorting.Sorting;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    private Sorting insertionSort = new InsertionSort();

    @Test
    public void sortingTest1(){
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9},insertionSort.sort(numbers));
    }

    @Test
    public void sortingTest2(){
        int[] numbers = new int[]{9,8,7,6,5,4,3,2,1};
        assertArrayEquals(insertionSort.sort(numbers),new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void sortingTest3(){
        int[] numbers = new int[]{9,9,9,1,1,1,8,8,8};
        assertArrayEquals(insertionSort.sort(numbers),new int[]{1,1,1,8,8,8,9,9,9});
    }
}
