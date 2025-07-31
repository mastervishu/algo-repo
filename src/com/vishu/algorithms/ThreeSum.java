package com.vishu.algorithms;


import java.util.*;

public class ThreeSum {
    private static final List<List<Integer>> ans = new ArrayList<>();

    public static List< List < Integer > > triplet(int n, int []arr) {
        if(n < 3) return Collections.emptyList();

        Arrays.sort(arr);

        for(int i = 0; i < n; i++){
            if(i > 0 && arr[i] == arr[i - 1]) continue;
            if(arr[i] > 0) break;
            twoSum(arr, -arr[i], i + 1, n - 1);
        }

        return ans;
    }

    public static void twoSum(int[] arr, int target, int start, int end){
        while(start < end){
            int sum = arr[start] + arr[end];

            if(sum < target){
                start++;
            } else if(sum > target){
                end--;
            } else{
                ans.add(new ArrayList<Integer>(List.of(-target, arr[start], arr[end])));
                start++; end--;

                while(start < end && arr[start - 1] == arr[start]) start++;
                while(start < end && arr[end] == arr[end + 1]) end--;
            }
        }
    }

    public List<List<Integer>> threeSumBetter(int[] nums) {
        Set<List<Integer>> ansSet = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n; i++){
            Set<Integer> hash = new HashSet<>();
            for(int j = i + 1; j < n; j++){
                int look = -(nums[i] + nums[j]);
                if(hash.contains(look)){
                    List<Integer> temp = new ArrayList<>(List.of(look, nums[i], nums[j]));
                    Collections.sort(temp);
                    ansSet.add(temp);
                }

                hash.add(nums[j]);
            }
        }

        return new ArrayList<>(ansSet);
    }
}
