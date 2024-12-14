package Arrays;

import java.util.HashMap;

public class singleNumber {
    public static void main(String[] args){
        int[] nums = {1,2,1,3,2};
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int result = 0;
        for(int i:nums){
            if(frequency.containsKey(i)){
                frequency.put(i,frequency.get(i)+1);
            }
            else{
                frequency.put(i,1);
            }
        }
        for (HashMap.Entry<Integer, Integer> i : frequency.entrySet()) {
            if (i.getValue() == 1) {
                result =i.getKey();
            }
        }
        System.out.println(result);
    }
}
