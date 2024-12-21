package Arrays;

public class maxSubarraySum {
    public static void main(String[] args){
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum=arr[0];
//        bf method
//        for(int i=0;i<arr.length;i++){
//            int dummySum=arr[i];
//            for(int j=i+1;j<arr.length;j++){
//                dummySum+=arr[j];
//                if(dummySum>maxSum){
//                    maxSum=dummySum;
//                }
//            }
//            dummySum=0;
//        }
//        System.out.println(maxSum);

//        optimized method
        int[] dummyArr = new int[arr.length];
        dummyArr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            if(dummyArr[i-1] < 0){
                dummyArr[i] = arr[i];
            }
            else{
                dummyArr[i] = dummyArr[i-1] + arr[i];
            }
            maxSum = Math.max(dummyArr[i],maxSum);
        }
        System.out.println(maxSum);
    }
}

