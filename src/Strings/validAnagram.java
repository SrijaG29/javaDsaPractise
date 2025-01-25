package Strings;

import java.util.HashMap;

public class validAnagram {
    public static void main(String[] args) {
        String s ="anagaram";
        String t ="naagaram";
        if(s == null || t == null || s.length()!=t.length()){
            System.out.println("false");
        }
        HashMap<Character,Integer> sd = new HashMap<>();
        HashMap<Character,Integer> td = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            sd.put(charS, sd.getOrDefault(charS, 0) + 1);
            td.put(charT, td.getOrDefault(charT, 0) + 1);
        }
        for (char key : sd.keySet()) {
            if (!td.containsKey(key) || !sd.get(key).equals(td.get(key))) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}

