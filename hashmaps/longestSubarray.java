package hashmaps;
import java.util.*;
public class longestSubarray {
    public static void main(String[] args) {
        int arr[] = {1,-1,-2,2};
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum =0;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(map.containsKey(sum)){
                count = (count+map.get(sum));
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        System.out.println(count);
    }
}
