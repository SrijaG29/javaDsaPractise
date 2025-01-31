package Strings;

import java.util.HashMap;
import java.util.Map;

public class romanToInteger {
    public static void main(String[] args) {
        String s = "III";
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int ans = 0;
        int i = 0;

        while (i < s.length()) {
            if (i == s.length() - 1) {
                ans += roman.get(s.charAt(i));
                break;
            } else if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
                ans += (roman.get(s.charAt(i + 1)) - roman.get(s.charAt(i)));
                i += 2;
            } else {
                ans += roman.get(s.charAt(i));
                i++;
            }
        }
        System.out.println(ans);
    }
}
