package com.vishu.algorithms;

public class CheckPrime {
    public static void main(String[] args) {
        int num = 12;
        int count = 0;

        for(int i = 1; i < Math.sqrt(num); i++){
            if(num % i == 0){
                count++;

                if(i != num / i){
                    count++;
                }
            }
        }

        boolean ans = count == 2;
        System.out.println("is prime > " + ans);
    }
}
