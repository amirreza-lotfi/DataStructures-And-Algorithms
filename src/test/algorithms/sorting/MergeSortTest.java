package test.algorithms.sorting;

import main.algorithm.sorting.MergeSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortTest {
    public MergeSort mergeSort = new MergeSort();

    @Test
    public void sortingTest1(){
        int[] numbers = new int[]{0,1,2,3,4,5,6,7,8};
        assertArrayEquals(new int[]{0,1,2,3,4,5,6,7,8},mergeSort.sort(numbers));
    }
    @Test
    public void sortingTest2(){
        int[] numbers = new int[]{9,8,7,6,5,4,3,2,1};
        assertArrayEquals(mergeSort.sort(numbers),new int[]{1,2,3,4,5,6,7,8,9});
    }

    @Test
    public void sortingTest3(){
        int[] numbers = new int[]{9,9,9,1,1,1,8,8,8};
        assertArrayEquals(mergeSort.sort(numbers),new int[]{1,1,1,8,8,8,9,9,9});
    }

    @Test
    public void testWhenArrayHasOnlyTwoNumberDEC(){
        int[] numbers = new int[]{9,8};
        assertArrayEquals(mergeSort.sort(numbers),new int[]{8,9});
    }

    @Test
    public void testWhenArrayHasOnlyTwoNumberACS(){
        int[] numbers = new int[]{8,9};
        assertArrayEquals(mergeSort.sort(numbers),new int[]{8,9});
    }

    @Test
    public void testWhenArrayHasOnlyOneNumber(){
        int[] numbers = new int[]{9};
        assertArrayEquals(mergeSort.sort(numbers),new int[]{9});
    }

    @Test
    public void testFindLeftOfArray1(){
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        assertArrayEquals(mergeSort.findLeftSide(3,numbers),new int[]{1,2,3});
    }
    @Test
    public void testFindLeftOfArray2(){
        int[] numbers = new int[]{1,2,3,4,5,6};
        assertArrayEquals(mergeSort.findLeftSide(3,numbers),new int[]{1,2,3});
    }

    @Test
    public void testFindRightOfArray1(){
        int[] numbers = new int[]{1,2,3,4,5,6,7};
        assertArrayEquals(mergeSort.findRightSide(3,numbers),new int[]{4,5,6,7});
    }
    @Test
    public void testFindRightOfArray2(){
        int[] numbers = new int[]{1,2,3,4,5,6};
        assertArrayEquals(mergeSort.findRightSide(3,numbers),new int[]{4,5,6});
    }


    @Test
    public void testConquer(){
        int[] r = new int[]{5,8,12};
        int[] l = new int[]{1,3,4,5,6,7,8};
        assertArrayEquals(mergeSort.conquerRightAndLeft(l,r),new int[]{1,3,4,5,5,6,7,8,8,12});
    }
    @Test
    public void testConquer2(){
        int[] r = new int[]{1,3,4,5,6,7,8};
        int[] l = new int[]{5,8,12};
        assertArrayEquals(mergeSort.conquerRightAndLeft(r,l),new int[]{1,3,4,5,5,6,7,8,8,12});
    }

}