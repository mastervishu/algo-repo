package com.vishu.algorithms;

import java.util.Map;
import java.util.HashMap;

public class LongestSumArrayWithSum {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 1};
        int k = 1;
        int ans = getLongestSubarray(nums, k);
        System.out.println("ans > " + ans);
    }

    public static int solution(int[] nums, int k){
        int n = nums.length;
        if(n == 0) return 0;

        int prefix = nums[0];
        int j = 0;

        for(int i = 1; i < n; i++){
            while(prefix > k){
                prefix -= nums[j];
                j++;
            }
            if(prefix == k) return i - j;
            prefix = prefix + nums[i];
        }

        return -1;
    }

    // this solution is an optimized approach if an array contains negative numbers
    public static int getLongestSubarray(int []nums, int k) {
        int maxLen = 0, sum = 0, n = nums.length;
        Map<Integer, Integer> hash = new HashMap<>();

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(sum == k){
                maxLen = Math.max(maxLen, i + 1);
            }

            int rem = sum - k;

            if(hash.containsKey(rem)){
                int len = i - hash.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!hash.containsKey(sum)){
                hash.put(sum, i);
            }
        }

        return maxLen;
    }
}
