package Arrays;

import java.util.Arrays;

public class moveZeros {
    public static void main(String[] args){
        int[] nums = {0,1,0,3,12};
        int c = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=0 && nums[c]==0){
                int temp = nums[c];
                nums[c] = nums[i];
                nums[i] = temp;
                c++;
            }
            if(nums[c]!=0){
                c++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
