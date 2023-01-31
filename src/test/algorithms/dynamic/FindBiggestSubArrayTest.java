package test.algorithms.dynamic;

import main.algorithm.dynamic.FindBiggestSubArray;
import main.algorithm.recursive.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindBiggestSubArrayTest {

    @Test
    public void test1() {
        int result = FindBiggestSubArray.findMaxSubArray(new int[]{-10,9,-5,11,3});
        assertEquals(result,18);
    }
    @Test
    public void test2() {
        int result = FindBiggestSubArray.findMaxSubArray(new int[]{1,9,-5,11,3});
        assertEquals(result,19);
    }
}