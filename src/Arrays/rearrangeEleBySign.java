package Arrays;

import java.util.ArrayList;

public class rearrangeEleBySign {
    public static void main(String[] args){
        int[] arr = {3,1,-2,-5,2,-4};
        ArrayList<Integer> parr = new ArrayList<>();
        ArrayList<Integer> narr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i: arr){
            if(i>0){
                parr.add(i);
            }
            else{
                narr.add(i);
            }
        }
        int x1=0,x2=0;
        while(x1<arr.length/2){
            result.add(parr.get(x1));
            x1++;
            result.add(narr.get(x2));
            x2++;
        }
        System.out.println(result);
    }
}

