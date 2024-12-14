package Arrays;

public class searchForNumber {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,6};
        int k = 7;
//        Linear search
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]==k){
//                System.out.println(true);
//            }
//        }
//        System.out.println(false);
//        Binary search
        int left = 0;
        int right = nums.length;
        while(left<right){
            int mid = nums.length/2;
            if (nums[mid] == k){
                System.out.println(true);
            }
            else if (nums[mid]<k){
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(false);
    }
}
