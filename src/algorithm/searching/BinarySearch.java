package algorithm.searching;

public class BinarySearch implements SearchingI {
    /**
     * It is another famous search algorithm. In this algorithm, the given array most be sorted.
     * <p>
     * Time Complexity: O(log n)
     * Auxiliary Space: O(log n)
     *
     * @param array given sorted array.
     * @param value the value that we want to find in array.
     * @return index of value in array.
     */
    @Override
    public int search(int[] array, int value) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (value == array[mid])
                return mid;
            else if (value > array[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
