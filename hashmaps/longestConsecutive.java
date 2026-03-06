package hashmaps;

import java.util.*;
public class longestConsecutive {
    public static void main(String[] args) {
        TreeMap<Integer, Boolean> map = new TreeMap<>();
        int arr[] = {100, 4, 200, 1, 3, 2};

        for(int i:arr){
            map.put(i, true);
        }

        Integer prev = null;
        int current = 1;
        int max = 0;
        for(int i:map.keySet()){
            if(prev!=null){
                if(i==prev+1){
                    current++;
                }else{
                    max = Math.max(max, current);
                    current=1;
                }
            }
            prev = i;
        }
        System.out.println(Math.max(max, current));
    }
}
