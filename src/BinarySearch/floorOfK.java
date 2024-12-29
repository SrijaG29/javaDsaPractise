package BinarySearch;

public class floorOfK {
    public static void main(String[] args) {
        int[] nums = {1,2,4,10,11,12,19};
        int left = 0;
        int right = nums.length-1;
        int target = 5;
        int floorindex =-1;
        while(left<=right){
            int mid = (left + right)/2;
            if(nums[mid]==target){
                System.out.println(mid);
                break;
            } else if (nums[mid]<target) {
                floorindex = mid;
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        System.out.println(floorindex);
    }
}

