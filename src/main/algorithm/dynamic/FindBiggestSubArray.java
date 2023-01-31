package main.algorithm.dynamic;

import java.util.Scanner;

public class FindBiggestSubArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i=0;i<n;++i)
            numbers[i] = scanner.nextInt();

        System.out.println(findMaxSubArray(numbers));
    }

    public static int findMaxSubArray(int[] numbers){
        int[] maximumSubArray = new int[numbers.length];
        maximumSubArray[0] = numbers[0];
        int answer = numbers[0];

        for(int i=1;i<numbers.length;++i){
            maximumSubArray[i] = Math.max(numbers[i],numbers[i]+maximumSubArray[i-1]);
            answer = Math.max(maximumSubArray[i],answer);
        }
        return answer;
    }
}
