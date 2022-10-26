package main.algorithm.searching;

public class ExponentialSearch implements SearchingI {

    @Override
    public int search(int[] array, int value) {
        if (array[0] == value)
            return 0;

        int high = 1;
        int low = 1;

        while (true) {
            if(high>=array.length){
                high = array.length - 1;
                break;
            }
            if (value == array[high])
                return high;
            if (value > array[high]) {
                low = high;
                high *= 2;
            }else if (value < array[high]) {
                break;
            }
        }

        //binarySearch
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
