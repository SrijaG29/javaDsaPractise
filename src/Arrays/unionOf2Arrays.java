package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class unionOf2Arrays {
    public static void main(String[] args){
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        HashSet<Integer> h=new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : a) {
            if (h.add(num)) { // Ensure no duplicates
                result.add(num);
            }
        }
        for(int i:b){
            if (h.add(i)) { // Ensure no duplicates
                result.add(i);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
