package com.vishu.algorithms;
import java.util.List;
import java.util.ArrayList;

public class SpriralOrder {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };

        List<Integer> ans = spiralOrder(matrix);
        System.out.println(ans);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = m - 1;
        int top = 0, bottom = n - 1;

        while(left <= right && top <= bottom){
            // left -> right
            for(int i = left; i <= right; i++){
                ans.add(matrix[top][i]);
            }
            top++;

            // top -> bottom
            for(int i = top; i <= bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;

            // right -> left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // bottom -> top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
