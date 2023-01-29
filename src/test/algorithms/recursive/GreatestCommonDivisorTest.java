package test.algorithms.recursive;

import main.algorithm.recursive.GreatestCommonDivisor;
import org.junit.Test;

import static org.junit.Assert.*;

public class GreatestCommonDivisorTest {

    @Test
    public void test1(){
        assertEquals(1,GreatestCommonDivisor.GCD(13,3));
    }
    @Test
    public void test2(){
        assertEquals(13,GreatestCommonDivisor.GCD(13,13));
    }
    @Test
    public void test3(){
        assertEquals(3,GreatestCommonDivisor.GCD(18,15));
    }
    @Test
    public void test4(){
        assertEquals(1,GreatestCommonDivisor.GCD(19,4));
    }
    @Test
    public void test5(){
        assertEquals(10,GreatestCommonDivisor.GCD(30,20));
    }
    @Test
    public void test6(){
        assertEquals(4,GreatestCommonDivisor.GCD(12,4));
    }
    @Test
    public void test7(){
        assertEquals(4,GreatestCommonDivisor.GCD(12,8));
    }@Test
    public void test8(){
        assertEquals(1,GreatestCommonDivisor.GCD(13,3));
    }
    @Test
    public void test9(){
        assertEquals(12,GreatestCommonDivisor.GCD(12,12));
    }
    @Test
    public void test10(){
        assertEquals(1,GreatestCommonDivisor.GCD(17,19));
    }

}