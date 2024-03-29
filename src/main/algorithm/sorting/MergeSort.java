package main.algorithm.sorting;

public class MergeSort implements Sorting {

    /**
     * The Merge Sort main.algorithm is a sorting main.algorithm that is considered an example of the divide and conquer strategy.
     * So, in this main.algorithm, the array is initially divided into two equal halves and then they are combined in a sorted manner.
     * We can think of it as a recursive main.algorithm that continuously splits the array in half until it cannot be further divided.
     * This means that if the array becomes empty or has only one element left, the dividing will stop, i.e. it is the base case
     * to stop the recursion.
     * If the array has multiple elements, we split the array into halves and recursively invoke the merge sort on each of the halves.
     * Finally, when both the halves are sorted, the merge operation is applied. Merge operation is the process
     * of taking two smaller sorted arrays and combining them to eventually make a larger one.
     * TimeComplexity = O(nLog(n))
     * Auxiliary Space: O(n)
     *
     * The Merge Sort is not in-place algorithm.
     * The Merge Sort is not adaptive.
     * The Merge Sort is parralelizable algorithm.
     *
     *
     * @param initialList
     * @return
     */
    @Override
    public int[] sort(int[] initialList) {
        return mergeSort(initialList);
    }

    private int[] mergeSort(int[] initialList) {
        int half = initialList.length / 2;
        if (initialList.length == 2) {
            int[] right = new int[]{initialList[1]};
            int[] left = new int[]{initialList[0]};
            return conquerRightAndLeft(left,right);
        }else if(initialList.length==1){
            return initialList;
        }

        int[] leftSide = findLeftSide(half, initialList);
        int[] rightSide = findRightSide(half, initialList);

        int[] sortedLeft = mergeSort(leftSide);
        int[] sortedRight = mergeSort(rightSide);

        return conquerRightAndLeft(sortedLeft, sortedRight);
    }

    public int[] findRightSide(int half, int[] initialList) {
        int[] right = new int[initialList.length - half];
        for (int i = half, j = 0; i < initialList.length; i++, j++) {
            right[j] = initialList[i];
        }
        return right;
    }

    public int[] findLeftSide(int half, int[] initialList) {
        int[] left = new int[half];
        for (int i = 0; i < half; i++) {
            left[i] = initialList[i];
        }
        return left;
    }

    public int[] conquerRightAndLeft(int[] left, int[] right) {
        int i;
        int iterateRightIndex = 0;
        int iterateLeftIndex = 0;
        int[] conqueredArray = new int[right.length + left.length];

        for (i = 0; i < conqueredArray.length; ++i) {
            if (iterateRightIndex == right.length || iterateLeftIndex == left.length)
                break;
            if (right[iterateRightIndex] > left[iterateLeftIndex]) {
                conqueredArray[i] = left[iterateLeftIndex];
                iterateLeftIndex++;
            } else {
                conqueredArray[i] = right[iterateRightIndex];
                iterateRightIndex++;
            }
        }

        while (iterateRightIndex < right.length) {
            conqueredArray[i] = right[iterateRightIndex];
            iterateRightIndex++;
        }
        while (iterateLeftIndex < left.length) {
            conqueredArray[i] = left[iterateLeftIndex];
            iterateLeftIndex++;
        }
        return conqueredArray;
    }

}
