package com.vishu.algorithms;

public class CheckDivisibility_3622 {
    public static void main(String[] args) {
        boolean ans = checkDivisibility(10);
        System.out.println("output > " + ans);
    }
    public static boolean checkDivisibility(int n) {
        int x = n;
        int sum = 0;
        int product = 1;

        while(x > 0){
            int digit = x % 10;
            sum += digit;
            product *= digit;
            x /= 10;
        }

        return n == (sum + product);
    }
}
