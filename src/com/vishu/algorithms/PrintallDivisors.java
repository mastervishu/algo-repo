package com.vishu.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintallDivisors {
    public static void main(String[] args) {
        int num = 36;
        List<Integer> arr = new ArrayList<>();

//        for(int i = 1; i <= num; i++){
//            if(num % i == 0) {
//                arr.add(i);
//            }
//        }

        for(int i = 1; i < Math.sqrt(num); i++){
            if(num % i == 0){
                arr.add(i);

                if(i != num / i){
                    arr.add(num / i);
                }
            }
        }
//        Collections.sort(arr);
        System.out.println("ans > " + arr);
    }
}
