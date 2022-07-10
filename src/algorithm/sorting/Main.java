package algorithm.sorting;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,12,-4,2,3,4,5,7,8,-9,7,6,43,45,34,5,345};
        int[] sorted = new InsertionSort().sort(a);

        for(int i:sorted)
            System.out.print(i + " ");
    }
}
