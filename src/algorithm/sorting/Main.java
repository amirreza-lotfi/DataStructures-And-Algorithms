package algorithm.sorting;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,12,4,6,3};
        int[] sorted = new MergeSort().sort(a);

        for(int i:sorted)
            System.out.print(i + " ");
    }
}
