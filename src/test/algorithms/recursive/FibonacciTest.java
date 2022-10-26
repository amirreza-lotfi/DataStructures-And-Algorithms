package test.algorithms.recursive;

import main.algorithm.recursive.Fibonacci;
import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    @Test
    public void fibonacci_1_must_be_1(){
        int x = Fibonacci.fibonacci(1);
        assertEquals(x,1);
    }
    @Test
    public void fibonacci_2_must_be_1(){
        int x = Fibonacci.fibonacci(2);
        assertEquals(x,1);
    }
    @Test
    public void fibonacci_3_must_be_2(){
        int x = Fibonacci.fibonacci(3);
        assertEquals(x,2);
    }
    @Test
    public void fibonacci_4_must_be_3(){
        int x = Fibonacci.fibonacci(4);
        assertEquals(x,3);
    }
    @Test
    public void fibonacci_5_must_be_5(){
        int x = Fibonacci.fibonacci(5);
        assertEquals(x,5);
    }
    @Test
    public void fibonacci_6_must_be_8(){
        int x = Fibonacci.fibonacci(6);
        assertEquals(x,8);
    }
    @Test
    public void fibonacci_7_must_be_13(){
        int x = Fibonacci.fibonacci(7);
        assertEquals(x,13);
    }
}