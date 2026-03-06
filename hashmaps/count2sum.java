package hashmaps;

import java.util.*;

public class count2sum {
    public static void main(String[] args) {
        int arr[] = {1,2,1,2};
        int b = 3;

        long count=0;
        long mod = 1000000007;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int comp = b-arr[i];
            if(map.containsKey(comp)){
                count = (count+map.get(comp))%mod;
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        System.out.println(count%mod);
    }
}
