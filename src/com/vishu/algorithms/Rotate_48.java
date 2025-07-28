package com.vishu.algorithms;

public class Rotate_48 {
    public static void main(String[] args) {
        Rotate_48 solve = new Rotate_48();
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        solve.rotate(matrix);
        print(matrix);

    }

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transposeInPlace(matrix, n);
        reverseMatrix(matrix, n);
    }

    public void transposeInPlace(int[][] matrix, int n){
        for(int row = 0; row < n; row++){
            for(int col = row + 1; col < n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }

    public void reverseMatrix(int[][] matrix, int n){
        for(int[] inner: matrix){
            reverseArr(inner, 0, n - 1);
        }
    }

    public void reverseArr(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }

    public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void print(int[][] matrix){
        int n = matrix.length;
        for (int[] ints : matrix) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
