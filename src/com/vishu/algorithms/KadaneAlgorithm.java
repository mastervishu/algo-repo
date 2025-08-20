package com.vishu.algorithms;

public class KadaneAlgorithm {
    public static void main(String[] args) {
//        int[] nums = {18, -6, -6, -5, 7, 10, 16, -6, -2, 0};
        int[] nums = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10 };
        int ans = solve(nums);

        System.out.println("ans > " + ans);
    }

    public static int solve(int[] nums){
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int num: nums){
            sum+= num;
            max = Math.max(sum, max);
            if(sum < 0){
                sum = 0;
            }
        }

        return Math.max(max, 0);
    }
}
