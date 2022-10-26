package test.algorithms.recursive;

import main.algorithm.recursive.Factorial;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial_6_must_be_120() {
        int f = Factorial.factorial(6);
        assertEquals(f,720);
    }
    @Test
    public void factorial_0_must_be_1() {
        int f = Factorial.factorial(1);
        assertEquals(f,1);
    }
    @Test
    public void factorial_1_must_be_1() {
        int f = Factorial.factorial(1);
        assertEquals(f,1);
    }
    @Test
    public void factorial_2_must_be_2() {
        int f = Factorial.factorial(2);
        assertEquals(f,2);
    }
    @Test
    public void factorial_3_must_be_6() {
        int f = Factorial.factorial(3);
        assertEquals(f,6);
    }
}