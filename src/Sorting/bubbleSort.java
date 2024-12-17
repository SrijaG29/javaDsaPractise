package Sorting;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args){
        int[] nums = {64,10,6,29,11};
        int n = nums.length;
        int i,j,temp;
        boolean swapped;
        for(i=0;i<n-1;i++){
            swapped = false;
            for(j=0;j<n-i-1;j++){
                if(nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

