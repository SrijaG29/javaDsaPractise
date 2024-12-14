package Arrays;

public class removeDuplicatesFromSortedArray {
    public static void main(String[] args){
        int[] nums = {0,0,1,2,2,3};
        int c = 0;
        for(int i=c+1;i<nums.length;i++){
            if(nums[c]!=nums[i]){
                c++;
                nums[c] = nums[i];
            }
        }
        System.out.println(c+1);
    }
}
