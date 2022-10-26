package main.algorithm.recursive;

public class Fibonacci {
    public static int fibonacci(int input){
        if(input == 1 || input == 2) return 1;
        return fibonacci(input-1) + fibonacci(input-2);
    }
}
