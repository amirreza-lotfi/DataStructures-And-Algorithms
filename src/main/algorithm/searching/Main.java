package main.algorithm.searching;

public class Main {
    public static void main(String[] args) {
        int index = new ExponentialSearch().search(
                new int[]{
                        -3,-2,1,3,6,50,55,67,99,100,199999
                },100
        );
        System.out.println(index);
    }
}
