package Arrays;

import java.util.HashMap;

public class majorityElement {
    public static void main(String[] args){
        int[] nums = {3,2,3};
        int majority = nums.length / 2;
        HashMap<Integer,Integer> frequency = new HashMap<>();
        for(int num:nums){
            if(frequency.containsKey(num)){
                frequency.put(num,frequency.get(num)+1);
            }
            else{
                frequency.put(num,1);
            }
        }
        for(HashMap.Entry<Integer,Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > majority) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
