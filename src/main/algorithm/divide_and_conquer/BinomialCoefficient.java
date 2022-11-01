package main.algorithm.divide_and_conquer;

public class BinomialCoefficient {
    //(n,k) = (n-1,k-1) + (n,k-1)   -> if(k==0 || n==k) return 1
    public static int bin(int n, int k){
        if(k==0 || n==k) return 1;
        return bin(n-1,k-1) + bin(n,k-1);
    }

}
