package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dutchNationalFlag {
    public static void main(String[] args){
        int[] arr = {2,0,2,1,1,0};
        int left = 0;
        int mid = 0;
        int right = arr.length-1;
        int temp;
        while(mid<=right){
            if(arr[mid]==0){
                temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                mid++;
                left++;
            } else if (arr[mid] == 1) {
                temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                mid++;
            }
            else {
                temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

