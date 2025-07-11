package com.vishu.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingAlgo {
    private Integer[] arr;
    private int capacity;

    public Integer[] getArr() {
        return arr;
    }

    public void setArr(Integer[] arr) {
        this.arr = arr;
        this.capacity = arr.length;
    }

    private void swap(int i, int j){
        Integer temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }

    private void doneMessage(){
        System.out.println("[i] sorting done successfully");
    }

    public void print(){
        for (Integer num: this.arr){
            System.out.print(num + "->");
        }
        System.out.println("null");
    }

    public void selectionSort(){
        for(int i = 0; i < this.capacity; i++){
            for(int k = i + 1; k < this.capacity; k++){
                if(this.arr[i] > this.arr[k]){
                    this.swap(i, k);
                }
            }
        }

        this.doneMessage();
    }
}
