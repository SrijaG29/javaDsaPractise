package Arrays;

public class buyAndSell {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        int l = 0;
        int r = 1;
        int result =0;
        int dummy =0;
        while(r<prices.length){
            if(prices[l]<prices[r]){
                System.out.println(prices[l]+" "+prices[r]);
                dummy = prices[r]-prices[l];
//                System.out.println(dummy);
                result = Math.max(result,dummy);
//                System.out.println(result);
            }
            else{
                l = r;
            }
            r++;
        }
        System.out.println(result);
    }
}

