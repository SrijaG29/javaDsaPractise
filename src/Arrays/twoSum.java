package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public static void main(String[] args){
        int[] arr = {2,10,11,7,15};
        int target = 9;
        HashMap<Integer,Integer> map = new HashMap<>();
        int sub =0;
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++){
            sub = target - arr[i];
            if(map.containsKey(sub)){
                result[0] = map.get(sub);
                result[1] = i;
            }
            map.put(arr[i],i);
        }
        System.out.println(Arrays.toString(result));
    }
}

