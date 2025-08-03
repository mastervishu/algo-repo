package com.vishu.algorithms;

import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        boolean ans = palindrome(n);
        System.out.println(ans);
    }

    public static boolean palindrome(int n){
        int x = n;
        int rev = 0;

        while(x > 0){
            int digit = x % 10;
            x /= 10;

            rev = rev * 10 + digit;
        }

        return rev == n;
    }
}
