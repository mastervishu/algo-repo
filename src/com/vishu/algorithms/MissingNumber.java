package com.vishu.algorithms;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        int ans = usingXor(nums, n);
        System.out.println("ans > " + ans);
    }

    public static int hashing(int[] nums, int n){
        int[] hash = new int[n + 1];

        for(int i = 0; i < n; i++){
            int num = nums[i];
            hash[num]++;
        }

        for(int i = 1; i <= n; i++){
            System.out.println("hash numebr > " + hash[i]+ " "+ i);
            if(hash[i] == 0) return i;

        }
        return -1;
    }

    public static int usingXor(int[] nums, int n){
        int xor1 = 0, xor2 = 0;

        for(int i = 0; i < n; i++){
            xor1 ^= (i + 1);
            xor2 ^= nums[i];
        }

        return xor1 ^ xor2;
    }
}
