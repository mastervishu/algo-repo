import com.vishu.algorithms.SortingAlgo;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SortingAlgo<Integer> algo = new SortingAlgo<Integer>();

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        algo.setArr(numbers);

    }
}