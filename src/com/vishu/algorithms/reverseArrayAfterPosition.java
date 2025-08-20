package com.vishu.algorithms;

import java.util.ArrayList;

public class reverseArrayAfterPosition {
    public static void main(String[] args) {

    }

    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        int n = arr.size();
        int left = m + 1;
        int right = n - 1;

        while(left < right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left++; right--;
        }
    }
}
