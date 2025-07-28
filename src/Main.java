import com.vishu.algorithms.SortingAlgo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingAlgo algo = new SortingAlgo();

        Integer[] numbers = new Integer[]{5, 2, 8, 1, 9};
        int[] nums = {1,0,2};
        algo.setArr(numbers);

//        algo.print();
//        algo.bubbleSort();
//        algo.insertionSort();
//        algo.mergeSort(nums, 0, nums.length - 1);
//        algo.bubleSortRecursion(nums, nums.length);
//        algo.insertionSortRecursion(nums, 0, nums.length);
        algo.quickSort(nums,0,  nums.length - 1);
        for(int num: nums){
            System.out.print(num + " ->");
        }
    }
}