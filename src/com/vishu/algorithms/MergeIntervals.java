package com.vishu.algorithms;
import java.util.*;


public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        int n = intervals.length;

        // Step 1: Sort intervals by start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] ans = new int[n][2];
        int j = 0;

        for (int[] interval : intervals) {
            // If first interval or no overlap
            if (j == 0 || ans[j - 1][1] < interval[0]) {
                ans[j++] = interval;
            } else {
                ans[j - 1][1] = Math.max(ans[j - 1][1], interval[1]);
            }
        }

        return Arrays.copyOf(ans, j);
    }

}
