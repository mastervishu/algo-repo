package com.vishu.algorithms;

public class PrintXPattern {
    public static void main(String[] args) {
        pattern(7);
    }
    public static void pattern(int n){
        for(int row = 0; row < n; row++){
            for(int column = 0; column < n; column++){
                if(column == row || n - row - 1 == column){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
