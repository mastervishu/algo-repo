package com.vishu.algorithms;

import java.util.Arrays;

public class FindSecondSandL {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
        int ssmall = secondSmallest(nums);
        int sLargest = secondLargest(nums);
        int[] ans = getSecondOrderElements(nums);
        System.out.println("second Smallest > " + ssmall);
        System.out.println("second Largest > " + sLargest);

        System.out.println("ans > " + Arrays.toString(ans));
    }

    public static int secondSmallest(int[] nums){
        if(nums.length == 0) return -1;

        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;
        
        for(int num: nums){
            if(num < small){
                sSmall = small;
                small = num;
            } else if(num < sSmall && num > small){
                sSmall = num;
            }
        }
        
        return sSmall;
    }

    public static int secondLargest(int[] nums){
        if(nums.length == 0) return -1;
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int num: nums){
            if(num > largest){
                sLargest = largest;
                largest = num;
            } else if(num > sLargest && num < largest){
                sLargest = num;
            }
        }

        return sLargest;
    }

    public static int[] getSecondOrderElements(int []a) {
        int sLargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;

        for(int num: a){
            // Find largest and second largest
            if(num > largest){
                sLargest = largest;
                largest = num;
            } else if(num > sLargest && num < largest){
                sLargest = num;
            }

            // Find smallest and second smallest
            if(num < small){
                sSmall = small;
                small = num;
            } else if(num < sSmall && num > small){
                sSmall = num;
            }
        }

        return new int[]{sLargest, sSmall};
    }
}
