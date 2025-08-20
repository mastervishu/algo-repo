package com.vishu.algorithms;

public class FindMissingRepeatingElement {
    public static int[] findMissingRepeatingNumbers(int[] nums){
        int n = nums.length;
        int xor1 = 0, xor2 = 0;

        for(int i = 0; i < n; i++){
            xor1 ^= (i + 1);
            xor2 ^= nums[i];
        }

        int repeatNum = xor1 ^ xor2;
        return new int[] {repeatNum, -1};
    }

    public static int findMissingNumber(int[] nums) {
        int n = nums.length ; // total numbers including the missing one

        int xorFull = 0;
        for (int i = 1; i <= n; i++) {
            xorFull ^= i;
        }

        int xorArray = 0;
        for (int num : nums) {
            xorArray ^= num;
        }

        return xorFull ^ xorArray;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        int[] ans = findMissingRepeatingNumbers(nums);
        int n = findMissingNumber(nums);

        System.out.println("number > " + n);

        for (int num: ans){
            System.out.print(num + " ");
        }
    }
}
