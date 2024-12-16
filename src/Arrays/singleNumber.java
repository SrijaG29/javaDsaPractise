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

class Solution {
    public int buttonWithLongestTime(int[][] events) {
        HashMap<Integer,Integer> timePressed = new HashMap<>();
        for(int i=0;i<events.length;i++){
            for(int j=0;j<events[0].length;j++){
                if(i==0 && j==0){
                    timePressed.put(events[0][0],events[0][1]);
                    break;
                }
                else{
                    if(timePressed.containsKey(events[i][0])){
                        timePressed.put(events[i][0],timePressed.get(events[i][0])+ (events[i][1] - events[i-1][1]));
                    }
                    else{
                        timePressed.put(events[i][0],(events[i-1][1] - events[i][1]));
                    }
                }
            }
        }
        for (HashMap.Entry<Integer, Integer> entry : timePressed.entrySet()) {
            System.out.println(entry.getKey()+" " +entry.getValue());
        }
        return 1;
    }
}
