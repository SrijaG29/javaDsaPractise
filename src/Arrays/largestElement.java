package Arrays;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size_arr = sc.nextInt();
        System.out.println("Enter " + size_arr + "elements");
        int[] arr = new int[size_arr];
        for(int i=0;i<size_arr;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>max){
                max = i;
            }
        }
        System.out.println("Maximum element is: "+max);
    }
}
