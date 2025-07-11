package com.vishu.algorithms;


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
        long startTime = System.nanoTime();

        for(int i = 0; i < this.capacity; i++){
            int min = i;
            for(int k = i; k < this.capacity; k++){
                if(this.arr[i] > this.arr[k]){
                    min = k;
                }
            }

            this.swap(min, i);
        }

        long durationInNano = System.nanoTime() - startTime;
        System.out.println("Execution time in milliseconds: " + (durationInNano / 1_000_000));
        this.doneMessage();

    }
}
