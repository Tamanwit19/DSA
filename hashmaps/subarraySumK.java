package hashmaps;
import java.util.*;
public class subarraySumK {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int b = 5;

        // return first continuos subarray which sums up to b

        // prefix sum + hashmaps
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            int comp = sum-b;
            if(map.containsKey(comp)){
                System.out.println(Arrays.copyOfRange(arr, map.get(comp)+1, i+1));
                return;
            }
            map.putIfAbsent(sum, i);
        }
    }
}
