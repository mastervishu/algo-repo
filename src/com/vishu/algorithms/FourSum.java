package com.vishu.algorithms;
import java.util.*;

public class FourSum {
    private static  final List<List<Integer>> ans = new ArrayList<>();

    public static void main(String[] args) {
        int[] nums = {2,2,2,2,2};
        fourSum(nums, 8);
        System.out.println("ans > " + ans);
    }

    public static void fourSum(int[] nums, int target) {
        int n = nums.length;
        if(n < 4) return;

        Arrays.sort(nums);

        for(int i = 0; i < n - 4; i++){
            for(int j = i + 1; j < n; j++){
                twoSum(nums, target, nums[i], nums[j], j + 1, n - 1);
            }
        }

    }

    public static void twoSum(int[] nums, int target,int first,int second, int i, int j){
        int temp = first + second;
        while(i < j){
            int sum = nums[i] + nums[j] + temp;
            if(sum < target) i++;
            else if(sum > target) j--;
            else {
                ans.add(new ArrayList<Integer>(List.of(first, second, nums[i], nums[j])));
                i++; j--;
                while(i < j && nums[i] == nums[i - 1]) i++;
                while(i < j && nums[j] == nums[j + 1]) j--;
            }
        }
    }
}
