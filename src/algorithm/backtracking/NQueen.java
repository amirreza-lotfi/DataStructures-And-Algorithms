package algorithm.backtracking;

import java.util.Scanner;

public class NQueen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] position = new int[n];
        nQueen(position,0,n);
    }
    public static void nQueen(int[] position, int index, int n){
        if (canPlace(position, index)) {
            if (index == n-1) printPosition(position);
            else {
                for (int k = 0; k < n; ++k) {
                    position[index + 1] = k;
                    nQueen(position, index + 1, n);
                }
            }
        }
    }
    public static boolean canPlace(int[] position, int index){
        for (int i=0;i<index;++i){
            if(position[i]==position[index] || Math.abs(position[i]-position[index]) == Math.abs(i-index))
                return false;
        }
        return true;
    }
    public static void printPosition(int[] position){
        for(int i=0;i<position.length;++i){
            System.out.println((i+1)+" "+(position[i]+1));
        }
    }
}
