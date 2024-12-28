package RandomQuestions;

public class bestSiteSeeingPair {
    public static void main(String[] args) {
        int[] values = {8,1,5,2,6};
        int maxValue = 0;
        int x = values[0];
////        bf method
//        for(int i=0;i<values.length-1;i++){
//            int sumValue = 0;
//            for(int j= i+1;j<values.length;j++){
//                sumValue = values[i]+values[j]+i-j;
//                if(maxValue<sumValue){
//                    maxValue = sumValue;
//                }
//            }
//        }
//        System.out.println(maxValue);
        for(int i=1;i<values.length;i++){
            if(values[i]-i + x > maxValue){
                maxValue = values[i] - i + x;
            }
            if(values[i] + i > x){
                x = values[i] + i;
            }
        }
        System.out.println(maxValue);
    }
}

