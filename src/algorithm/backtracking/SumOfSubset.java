package algorithm.backtracking;

import java.util.Scanner;
import java.util.Stack;

public class SumOfSubset {
    static Stack stack = new Stack<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //size of input array
        int number = sc.nextInt();

        int sumOfSubset = sc.nextInt();

        //getting array from user
        int[] inputNumbers = new int[number];
        for(int i=0;i<number;++i)
            inputNumbers[i] = sc.nextInt();

        solve(inputNumbers,0,0, sumOfSubset);
    }
    public static void solve(int[] inputNumbers, int sum, int index, int sumOfSubnet){
        if(sum == sumOfSubnet){
            printStack();
            stack.pop();
            return;
        }
        if(sum>sumOfSubnet){
            stack.pop();
        }else{
            while (index<inputNumbers.length) {
                stack.push(inputNumbers[index]);
                solve(inputNumbers,sum+inputNumbers[index],index+1,sumOfSubnet);
                index++;
            }
            if(!stack.isEmpty())
                stack.pop();
        }
    }

    public static void printStack(){
        for (Object o : stack) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
