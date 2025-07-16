package com.vishu.algorithms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        boolean ans = solution(num);
        System.out.println("answer > "+ ans);
    }

    public static boolean solution(int num){
        int pow = (int) Math.log10(num) + 1;
        int current = num;

        int ans = 0;

        while(num > 0){
            int digit = num % 10;
            num /= 10;
            ans += (int) Math.pow(digit, pow);
        }
        return ans == current;
    }
}
