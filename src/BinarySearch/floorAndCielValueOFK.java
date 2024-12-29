package BinarySearch;

import java.util.Arrays;

public class floorAndCielValueOFK {
    public static void main(String[] args) {
        int[] nums = {5, 6, 8, 9, 6, 5, 5, 6};
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;
        int target = 7;
        int floorIndex =-1;
        int ceilIndex = -1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            } else if (nums[mid]<target) {
                floorIndex = nums[mid];
                left = mid +1;
            }
            else{
                ceilIndex = nums[mid];
                right = mid -1;
            }
        }
        System.out.println(floorIndex+" "+ceilIndex);
    }
}
