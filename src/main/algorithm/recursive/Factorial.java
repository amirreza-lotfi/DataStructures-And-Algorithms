package main.algorithm.recursive;

public class Factorial {
    public static void main(String[] args) {

    }

    static int factorial(int input){
        if (input == 0)
            return 1;
        return input* factorial(input-1);
    }
}
