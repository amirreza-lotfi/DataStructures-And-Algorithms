package main.algorithm.backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintSubsetsOfArray {
    public static void
    findSubsets(List<List<Integer>> subset, ArrayList<Integer> nums, ArrayList<Integer> output, int index) {
        // Base Condition
        if (index == nums.size()) {
            return;
        }

        System.out.println(output);
        output.add(nums.get(index));

        int newIndex = index;
        while (newIndex<nums.size()){
            newIndex++;
            findSubsets(subset,nums,new ArrayList<>(output),newIndex);
        }
    }

    public static void main(String[] args) {

        //Main List for storing all subsets
        List<List<Integer>> subset = new ArrayList<>();

        // Input ArrayList
        ArrayList<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        findSubsets(subset, input, new ArrayList<>(), 0);


    }
}
