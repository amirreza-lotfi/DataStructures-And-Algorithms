package algorithm.sorting;

public class SelectionSort implements Sorting {

    /**
     * In Selection sort, array separates two part; sorted section and unsorted section.
     * Selection sort has 3 steps :
     *
     *      1- finding index of minimum value that its index is bigger that currentPosition(init = 0)
     *      2- swap it for currentPosition in array.
     *      3- currentPosition +=1
     *
     * Time Complexity : O(N^2)
     * Auxiliary Space : O(1)
     *
     * @param initialList
     * @return sorted of initialList
     */

    @Override
    public int[] sort(int[] initialList) {
        int[] result = initialList.clone();

        for(int currentPosition = 0;currentPosition < result.length; currentPosition++) {
            int minimum = findIndexOfMinimumValue(result,currentPosition);
            swap(result,minimum,currentPosition);
        }
        return result;
    }

    private void swap(int[] array, int first, int second){
        int flag = array[first];
        array[first] = array[second];
        array[second] = flag;
    }

    private int findIndexOfMinimumValue(int[] array, int startIndex){
        int minimumValue = array[startIndex];
        int minimumIndex = startIndex;

        for(int i = startIndex;i<array.length;i++){
            if(array[i] < minimumValue){
                minimumIndex = i;
                minimumValue = array[i];
            }
        }
        return minimumIndex;
    }
}
