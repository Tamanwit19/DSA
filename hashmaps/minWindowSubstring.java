package hashmaps;

import java.util.*;

public class minWindowSubstring {
    public static void main(String[] args) {
        String str = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();
        int high=0, low=0, max=0;
        for(high=0; high<str.length(); high++){
            char c = str.charAt(high);
            if(map.containsKey(c)){
                low = Math.max(low, map.get(c)+1);
            }
            map.put(c, high);
            max = Math.max(max, high-low+1);
        }
        System.out.println(max);
    }
}
