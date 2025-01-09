package Strings;

public class longestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        if (strs.length == 0) {
            System.out.println("");
        }
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String ans = "";
            int r = Math.min(result.length(), strs[i].length());
            for (int j = 0; j < r; j++) {
                if (result.charAt(j) == strs[i].charAt(j)) {
                    ans += result.charAt(j);
                } else {
                    break;
                }
            }
            result = ans;
            if (result.isEmpty()) {
                break;
            }
        }
        System.out.println(result);
    }
}