package com.vishu.algorithms;

public class RemoveDuplicate {
    public static int removeDuplicates(int[] arr,int n) {
        int i = 0;

        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }

        return ++i;
    }
}
