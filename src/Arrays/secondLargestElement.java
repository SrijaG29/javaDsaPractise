package Arrays;

public class secondLargestElement {
    public static void main(String[] args){
        int[] arr = {12,35,10,2,34,6};
        int maxVal = arr[0];
        int secondMaxVal = 0;
        for(int i =1; i<arr.length; i++){
            if(arr[i]>maxVal){
                secondMaxVal = maxVal;
                maxVal = arr[i];
            }
            else if(arr[i]<maxVal && arr[i]>secondMaxVal){
                secondMaxVal = arr[i];
            }
        }
        System.out.println(secondMaxVal !=0 ? secondMaxVal : -1);
    }
}
