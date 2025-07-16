package com.vishu.algorithms;

public class FindGCD {
    public static void main(String[] args) {
        int n1 = 12, n2 = 9;
        int ans = getGcd(n1, n2);
        System.out.println("Greated Common Divided > " + ans);
    }

    public static  int getGcd(int n1, int n2){
//        int gcd = -1;
//
//        for(int i = 1; i < Math.min(n1, n2); i++){
//            if(n1 % i == 0 || n2 % i == 0){
//                gcd = i;
//            }
//        }
//
//        return  gcd;
        while(n1 > 0 && n2 > 0){
            if(n1 > n2) n1 %= n2;
            else n2 %= n1;
        }
        if(n1 == 0) return n2;
        return n1;
    }

//    public int getLcf(int n1, int n2){
//
//    }
}
