package com.vishu.algorithms;

public class CountDigits {
    public static void main(String[] args) {
        int ans = solve(35);
        System.out.println("ans > " + ans);
    }

    public static int solve(int num){
        return (int) Math.log10(num) + 1;
    }
}
