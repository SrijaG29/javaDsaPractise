package Strings;

public class maximumNestingDepthOfTheParentheses {
    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";
        int ans =0;
        int c =0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                c+=1;
            } else if (s.charAt(i)==')') {
                if(ans<c){
                    ans = c;
                    c-=1;
                }
                else{
                    c-=1;
                }
            }
        }
        System.out.println(ans);
    }
}

