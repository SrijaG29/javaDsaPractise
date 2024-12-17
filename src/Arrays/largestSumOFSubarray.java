package Arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class largestSumOFSubarray {
    public static void main(String[] args){
        int[] arr = {6,1,2,3,5,7};
        int k = 5;
        ArrayList<Integer> result = new ArrayList<>();
        int maxLength = 0;
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum= 0;
        sumIndexMap.put(0, -1);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sumIndexMap.containsKey(sum - k)){
                int startIndex = sumIndexMap.get(sum - k)+1;
                int len = i - startIndex+1;
                if(len>maxLength){
                    maxLength = len;
                    result.clear();
                }
            }
            sumIndexMap.putIfAbsent(sum, i);
        }
        System.out.println(maxLength);
    }
}
