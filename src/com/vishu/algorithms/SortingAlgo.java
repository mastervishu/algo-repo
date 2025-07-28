package com.vishu.algorithms;


import java.util.ArrayList;
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

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void doneMessage(String algo){
        System.out.println("[i] sorting done successfully by " + algo);
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
        this.doneMessage("selection sort");
        this.print();
    }

    public void  bubbleSort(){
        boolean swapped;
        for(int i = 0; i < this.capacity; i++){
            swapped = true;
            for(int j = 0; j < this.capacity - i - 1; j++){
                if(this.arr[j] > this.arr[j + 1]){
                    this.swap(j, j + 1);
                    swapped = false;
                }
            }

            if(!swapped) break;
        }

        this.doneMessage("Bubble Sort");
        this.print();
    }

    public void insertionSort(){
        for(int i = 0; i < this.capacity; i++){
            int j = i;
            while (j > 0 && this.arr[j - 1] > this.arr[j]){
                this.swap(j - 1, j);
                j--;
            }
        }
        doneMessage("Insertion sort");
        print();
    }

    public void merge(int[] nums, int low, int mid, int high){
        int left = low;
        int right = mid + 1;

        List<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(nums[left] <= nums[right]){
                temp.add(nums[left++]);
            } else {
                temp.add(nums[right++]);
            }
        }

        while(left <= mid){
            temp.add(nums[left++]);
        }

        while (right <= high){
            temp.add(nums[right++]);
        }

        for(int i = low; i <= high; i++){
            nums[i] = temp.get(i - low);
        }
    }

    public void mergeSort(int[] nums, int low, int high){
        // write base condition
        if(low >= high) return;

        int mid = (high + low) / 2;

        // left half
        mergeSort(nums, low, mid);

        // right half
        mergeSort(nums, mid + 1, high);

        //merge both sorted arrays
        merge(nums, low, mid, high);
    }

    public void bubleSortRecursion(int[] nums, int n){
        // base condition
        if(n <= 1) return;

        boolean didSwap = false;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] > nums[i + 1]){
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;

                didSwap = true;
            }
        }

        if(!didSwap) return;
        bubleSortRecursion(nums, n - 1);
    }

    public void insertionSortRecursion(int[] nums, int i, int n){
        //base condition
        if(i == n) return;

        int j = i;
        while(j > 0 && nums[j - 1] > nums[j]){
            int temp = nums[j - 1];
            nums[j - 1] = nums[j];
            nums[j] = temp;
            j--;
        }

        insertionSortRecursion(nums, i + 1, n);
    }

    public int partition(int[] nums, int low, int high){
        int pivot = nums[low];
        int i = low;
        int j = high;

        while (i < j){
            while (nums[i] <= pivot && i < high) i++;
            while (nums[j] > pivot && j > low) j--;
            if(i < j) swap(nums, i, j);
        }

        swap(nums, low, j);
        return j;
    }

    public void quickSort(int[] nums, int low, int high){
        if(low < high){
            int p = partition(nums, low, high);
            quickSort(nums, low, p - 1);
            quickSort(nums, p + 1, high);
        }


    }
}
