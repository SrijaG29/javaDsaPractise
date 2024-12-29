package BinarySearch;

public class binarySearch {
    public static void main(String[] args){
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                System.out.println("Element found at index: "+mid);
                break;
            }
            else if(nums[mid]<target){
                left = mid +1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println("Element no found");
    }

}

