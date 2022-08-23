package algorithm.searching;

public class Main {
    public static void main(String[] args) {
        int index = new BinarySearch().search(
                new int[]{
                        -3,-2,1,3,6,50,55,67,99,100,199999
                },65
        );
        System.out.println(index);
    }
}
