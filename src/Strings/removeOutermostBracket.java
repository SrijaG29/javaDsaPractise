package Strings;

public class removeOutermostBracket {
    public static void main(String[] args) {
        String s = "(())(()())";
        StringBuilder result = new StringBuilder();
        StringBuilder dummy=new StringBuilder();
        int open =0;
        int close =0;
        for(int i=0;i<s.length();i++){
            dummy.append(s.charAt(i));
            if(s.charAt(i)=='('){
                open++;
            }
            else if(s.charAt(i)==')'){
                close++;
            }
            if(open==close){
                result.append(dummy.substring(1,dummy.length()-1));
                dummy.setLength(0);
                open =0;
                close=0;
            }
        }
        System.out.println(result.toString());
    }
}
