package com.vishu.algorithms;

public class RotateMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

//        int[][] ans  = rotateWithExtraSpace(matrix);
//        int[][] ans = transposeMatrix(matrix);
        print(matrix);
        System.out.println();
        transposeInPlace(matrix);
        transposeMatrix(matrix);
        print(matrix);
    }

    public static int[][] rotateWithExtraSpace(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ans[j][n - 1 - i] = matrix[i][j];
            }
        }

        return ans;
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

    public static int[][] transposeMatrix(int[][] matrix){
        int n = matrix.length;
        int[][] ans = new int[n][n];

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                ans[col][row] = matrix[row][col];
            }
        }

        return ans;
    }

    public static void transposeInPlace(int[][] matrix){
        int n = matrix.length;
        for(int row = 0; row < n; row++){
            for(int col = row + 1; col < n; col++){
                int temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
    }

    public static void reverseMatrix(int[][] matrix){
        int n = matrix.length;

        for (int[] ints : matrix) {
            reverseArr(ints, 0, n - 1);
        }
    }

    public static void reverseArr(int[] nums, int start, int end){
        int left = start;
        int right = end;

        while (left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
