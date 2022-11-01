package main.algorithm.dynamic;

public class Fibonacci {
    public static int[] fibonacci(int n){
        int[] series = new int[n];
        series[0] = 0;
        if(n>10){
            series[1] = 1;
            for(int i=2;i<=n;++i)
                series[i] = series[i-1] + series[i-2];
        }
        return series;
    }
}
