package BinarySearch;

public class searchInsertionPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int left =0;
        int right = nums.length-1;
        int result = -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            }
            else if(nums[mid]<target){
                result = mid+1;
                left = mid +1;
            }
            else{
                result = mid;
                right = mid -1;
            }
        }
        System.out.println(result);
    }
}

