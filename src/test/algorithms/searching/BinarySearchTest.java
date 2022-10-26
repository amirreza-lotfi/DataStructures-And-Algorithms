package test.algorithms.searching;

import main.algorithm.searching.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinarySearchTest {
    int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};

    @Test
    public void one_must_at_0(){
        Assert.assertEquals(0,new BinarySearch().search(numbers,1));
    }

    @Test
    public void two_must_at_1(){
        assertEquals(1,new BinarySearch().search(numbers,2));
    }

    @Test
    public void three_must_at_2(){
        assertEquals(2,new BinarySearch().search(numbers,3));
    }
    @Test
    public void four_must_at_3(){
        assertEquals(3,new BinarySearch().search(numbers,4));
    }
    @Test
    public void five_must_at_4(){
        assertEquals(4,new BinarySearch().search(numbers,5));
    }
    @Test
    public void six_must_at_5(){
        assertEquals(5,new BinarySearch().search(numbers,6));
    }@Test
    public void seven_must_at_6(){
        assertEquals(6,new BinarySearch().search(numbers,7));
    }
    @Test
    public void eight_must_at_7(){
        assertEquals(7,new BinarySearch().search(numbers,8));
    }
    @Test
    public void nine_must_at_8(){
        assertEquals(8,new BinarySearch().search(numbers,9));
    }
    @Test
    public void ten_must_at_9(){
        assertEquals(9,new BinarySearch().search(numbers,10));
    }

}