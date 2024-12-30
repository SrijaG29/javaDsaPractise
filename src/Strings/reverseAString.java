package Strings;
import java.util.Arrays;

public class reverseAString {
    public static void main(String[] args) {
        String s = " the  sky is blue ";
        String[] words = s.split("\\s+"); // \\s+ will remove multiple spaces between the wprds and give only one space
        //        System.out.println(Arrays.toString(words));
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]);
            if(i!=0){
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }

}
