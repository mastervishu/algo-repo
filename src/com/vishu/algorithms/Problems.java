package com.vishu.algorithms;

import java.util.Arrays;

public class Problems {
    public static void main(String[] args) {
//        boolean ans = isStringPalindrome("abccbaa");
        int ans = fibonacci(4);
        System.out.println("\nreverse ans > " + ans);
    }

    public static boolean isStringPalindrome(String str){
        int left = 0, right = str.length() - 1;
        while (left < right){
            if(!Character.isAlphabetic(str.charAt(left))){
                left++;
            } else if(!Character.isLetterOrDigit(str.charAt(right))){
                right++;
            } else if(Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))){
                return false;
            }

            left++;
            right--;

        }

        return true;
    }

    public static void swap(char[] nums, int i, int j){
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int fibonacci(int N){
        System.out.println(N);
        // Base Condition.
        if(N <= 1){

            return N;
        }


        // Problem broken down into 2 functional calls
        // and their results combined and returned.
        int last = fibonacci(N-1);
        int slast = fibonacci(N-2);

        return last + slast;
    }
}
