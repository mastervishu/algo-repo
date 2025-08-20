package com.vishu.algorithms;

import java.util.ArrayList;
import java.util.List;

public class CheckArrayIsSorted {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 5, 4));
        boolean ans = isSorted(nums);
        System.out.println("Array is sorted > " + ans);
    }
    public static boolean isSorted(List<Integer> nums){
        int n = nums.size();
        if(n == 0) return false;

        for(int i = 1; i < n; i++){
            if(nums.get(i) < nums.get(i - 1)){
                return false;
            }
        }

        return true;
    }
}
