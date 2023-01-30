package main.algorithm.inductive_reasoning;

import java.util.Scanner;

public class FindMaximumSubArray {
    /**
     * Problem: Find maximum subarray of array
     * input : array
     * output: max subarray
     *
     * Time Complexity = O(n)
     *
     * There are two modes.
     *  1- the largest subarray is element 'i'
     *  2- it contains 'i' and its previous elements.
     *  This issue is investigated using inductive reasoning.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i=0;i<n;++i)
            numbers[i] = scanner.nextInt();

        System.out.println(findMaxSubArray(numbers));
    }

    public static int findMaxSubArray(int[] numbers){
        int n = numbers.length;
        int answer = Integer.MIN_VALUE;
        int maxSumArray = numbers[n-1]; //last element

        for (int i=n-2; i>=0 ; i--){
            maxSumArray = Math.max(numbers[i], numbers[i]+maxSumArray);
            answer = Math.max(answer, maxSumArray);
        }

        return answer;
    }
}
