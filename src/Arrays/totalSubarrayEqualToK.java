package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class totalSubarrayEqualToK {
    public static void main(String[] args){
        int[] arr = {1,-1,0};
        int k = 0;
        int count = 0;
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        int sum = 0;
        prefixSumCount.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }
            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}


