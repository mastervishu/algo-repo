package com.vishu.algorithms;

public class Recursion {
    public static void main(String[] args) {
//        int ans = print(0, 10);
//        System.out.println("Recursion ans > " + ans);
//        printNameNTimes("Vishu's", 10, 1);
//        func1(0, 1, 100);
//        Nto1(10);
//        toN(5, 1);
//        int ans = sumOfNNumber(5, 0);
//        System.out.println("ans > " + ans);
//        int fact = factorial(4);
//        System.out.println("Factorial of a number > " + fact);
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = reverseArray(arr, 0, arr.length - 1);

        for (int num: ans){
            System.out.printf("%d ", num);
        }
    }

    public static int print(int num,int base){
        if(num > base){
            System.out.println("meet base condition");
            return num;
        }

        System.out.println("[+] again call recursion :: " +  num);
        return print(num+ 1, base);
    }

    public static void printNameNTimes(String name, int limit, int iter){
        if(iter > limit) return;
        System.out.println(name);
        printNameNTimes(name, limit, iter + 1);
    }

    public static void func1(int num, int start, int end){
        if(start > end) return;
        System.out.println("[+] number > " + num);
        func1(num + 1, start + 1, end);
    }

    public static void Nto1(int num){
        if(num < 1) return;
        System.out.println(num);
        Nto1(num - 1);
    }

    public static void toN(int limit, int num){
        if(limit < num) return;
        System.out.println(num);
        toN(limit, num + 1);
    }

    public static int sumOfNNumber(int num, int sum){
        // also use the formula to find a sum of natural number :: {n * (n + 1) / 2 = sum}!!
        if(num < 1) return sum;
        System.out.println(sum + " " + num);
        return sumOfNNumber(num - 1, sum + num);
    }

    public static int factorial(int n){
        if(n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static int[] reverseArray(int[] nums, int left, int right){
       if(left > right) return nums;
       swap(nums, left, right);
       return reverseArray(nums, left + 1, right - 1);
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
