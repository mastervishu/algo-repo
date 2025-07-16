package com.vishu.algorithms;

public class BasicMath {
    public static void main(String[] args) {
        int num = 1211;
//      int len = countNumber(num);
//        System.out.println("Length of digit > " + len);
        int reverse = reverseNumebr(num);
//        System.out.println("Reverse number > " +  reverse);
        boolean isNumer = isNumberPalindrome(num);
        System.out.println("Is palindrome > " + isNumer);
    }

    public static  int countNumber(int num){
        return (int) (Math.log10(num) + 1);
    }
    public static  int reverseNumebr(int num){
        int reverse = 0;

        while(num > 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }

        return  reverse;
    }
    public static boolean isNumberPalindrome(int num){
        return  reverseNumebr(num) == num;
    }




}
