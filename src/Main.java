import com.vishu.algorithms.SortingAlgo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingAlgo algo = new SortingAlgo();

        Integer[] numbers = new Integer[]{5, 2, 8, 1, 9};
        algo.setArr(numbers);

        algo.print();
        algo.selectionSort();
        algo.print();
    }
}