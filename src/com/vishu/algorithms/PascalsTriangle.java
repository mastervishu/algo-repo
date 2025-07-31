package com.vishu.algorithms;
import java.util.List;
import java.util.ArrayList;

public class PascalsTriangle {
    public static void main(String[] args) {
//        int ans = ncr(4, 4);
//        System.out.println("nCr > " + ans);

        System.out.println(generate(5));
    }

    public static int ncr(int n, int r){
        int ans = 1;

        for(int i = 0; i < r; i++){
//            System.out.println((n - i) + " C " + i);
            ans *= (n - i);
            ans /= (i + 1);
        }

        return ans;
    }

    public static List<Integer> generateRow(int row){
        List<Integer> ans = new ArrayList<>();
        int rem = 1;
        ans.add(1);

        for(int i = 1; i < row; i++){
            rem *= (row - i);
            rem /= i;
            ans.add(rem);
        }

        return ans;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 1; i <= numRows; i++){
            ans.add(generateRow(i));
        }

        return ans;
    }


}
