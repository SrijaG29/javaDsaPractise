package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class isomorphicString {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";

        if (s.length() != t.length()) {
            System.out.println("No");
        }

        Map<Character, Character> mapSToT = new HashMap<>();
        Map<Character, Character> mapTToS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            if (mapSToT.containsKey(charS)) {
                if (mapSToT.get(charS) != charT) {
                    System.out.println("No");
                }
            } else {
                mapSToT.put(charS, charT);
            }
            if (mapTToS.containsKey(charT)) {
                if (mapTToS.get(charT) != charS) {
                    System.out.println("No");
                }
            } else {
                mapTToS.put(charT, charS);
            }
        }
        System.out.println("Yes");
    }
}

