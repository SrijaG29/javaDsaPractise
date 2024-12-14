package Arrays;

public class findMissingElement {
    public static void main(String[] args){
        int[] nums = {1,3,0};
        int totalsum = (nums.length*(nums.length+1))/2;
        int sum = 0;
        for(int i : nums){
            sum = sum + i;
        }
        System.out.println(totalsum - sum);
    }
}
