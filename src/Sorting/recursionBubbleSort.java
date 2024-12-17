package Sorting;

import java.util.Arrays;

public class recursionBubbleSort {
    public static void main(String[] args){
        int[] arr = {40,34,6,19,11};
        System.out.println("Orginal array before sorting is: " +Arrays.toString(arr));
        bubbleSort(arr,arr.length);
        System.out.println("Sorted array after sorting is: " +Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int n){
        if(n ==1){
            return;
        }
        boolean swapped = false;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swapped = true;
            }
        }
        if(!swapped)
            return;
        bubbleSort(arr,n-1);
    }

}
