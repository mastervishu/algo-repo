package com.vishu.algorithms;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class MajorityElement2_229 {
    public List<Integer> majorityElementBetter(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        if(n == 0) return ans;

        int mini = (int)(n / 3) + 1;
        Map<Integer, Integer> hash = new HashMap<>();

        for (int num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        return ans;
    }

    public List<Integer> majorityElementOptimize(int[] nums){
        List<Integer> ans = new ArrayList<>();

        int count1 = 0, count2 = 0;
        int el1 = Integer.MIN_VALUE;
        int el2 = Integer.MIN_VALUE;

        for(int num: nums){
            if(count1 == 0 && el2 != num){
                count1 = 1;
                el1 = num;
            } else if(count2 == 0 && el1 != num){
                count2 = 1;
                el2 = num;
            } else if (el1 == num) count1++;
            else if (el2 == num) count2++;
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        for(int num: nums){
            if(el1 == num) count1++;
            else if(el2 == num) count2++;
        }

        int thredSold = nums.length / 3;

        if(thredSold < count1) ans.add(el1);
        if(thredSold < count2) ans.add(el2);

        return ans;
    }
}
