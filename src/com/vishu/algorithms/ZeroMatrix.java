package com.vishu.algorithms;

import java.util.List;
import java.util.ArrayList;

public class ZeroMatrix {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

//        matrix.add(new ArrayList<>(List.of(1, 1, 1)));
//        matrix.add(new ArrayList<>(List.of(1, 0, 1)));
//        matrix.add(new ArrayList<>(List.of(1, 1, 1)));

        matrix.add(new ArrayList<>(List.of(6, 5, 1, 6, 8)));
        matrix.add(new ArrayList<>(List.of(2, 8, 0, 7, 5)));
        matrix.add(new ArrayList<>(List.of(4, 4, 0, 6, 2)));
        matrix.add(new ArrayList<>(List.of(9, 6, 3, 7, 5)));

        List<ArrayList<Integer>> ans = zeroMatrix(matrix, 4, 5);

        for (ArrayList<Integer> row : ans) {
            System.out.println(row);
        }

    }

    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> col = new ArrayList<>();

        for(int i = 0; i < n; i++){
            col.add(0);
        }

        for(int i = 0; i < m; i++){
            row.add(0);
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix.get(i).get(j) == 0){
                    col.set(i, 1);
                    row.set(j, 1);
                }
            }
        }

        for(int i = 0; i < n; i++){
            ArrayList<Integer> inner = matrix.get(i);
            for(int j = 0; j < m; j++){
                if(row.get(j) == 1 || col.get(i) == 1){
                    inner.set(j, 0);
                }
            }

            ans.add(inner);
        }

        return ans;
    }
}
