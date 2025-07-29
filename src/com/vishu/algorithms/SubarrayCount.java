package com.vishu.algorithms;
import java.util.Map;
import java.util.HashMap;

public class SubarrayCount {
    public static void main(String[] args) {
        int[] nums = {1,-1,0};
        int ans = subarraySum(nums, 0);
        System.out.println("ans  >> " + ans);
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int prefix = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0, 1);

        for(int num: nums){
            prefix += num;
            int remove = prefix - k;
            count+= hash.getOrDefault(remove, 0);
            hash.put(prefix, hash.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}
