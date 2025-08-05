import java.util.*;

public class CountSubarrayWithGivenXor {
    public static void main(String[] args) {
        int ans = subarraysXor(new ArrayList<>(List.of(5, 3, 8, 3, 10)), 8);
        System.out.println("ans  > " + ans);
    }

    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int prefix = 0;
        int count = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        int n = arr.size();

        hash.put(0 , 1);

        for(int i = 0; i < n; i++){
            prefix ^= arr.get(i);

            int required = prefix ^ x;
            count += hash.getOrDefault(required, 0);
            hash.put(prefix, hash.getOrDefault(prefix, 0) + 1);

        }

        return count;
    }
}
