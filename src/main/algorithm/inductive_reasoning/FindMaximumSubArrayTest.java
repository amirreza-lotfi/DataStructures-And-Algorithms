package main.algorithm.inductive_reasoning;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaximumSubArrayTest {
    @Test
    public void test1(){
        assertEquals(FindMaximumSubArray.findMaxSubArray(new int[]{-7,3,-1,2,-4,3}),4);
    }

    @Test
    public void test2(){
        assertEquals(FindMaximumSubArray.findMaxSubArray(new int[]{-1,-2,-3}),-1);
    }
}