package main.algorithm.recursive;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        /***
         * Problem : Get to integer number and calculate greatest common divisor.
         * inputs : two number
         * output: greatest common divisor of two number
         *
         * Time Complexity = O(Log(a+b))
         * */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(GCD(a, b));
    }

    public static int GCD(int a, int b){
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }
}
