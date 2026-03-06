package hashmaps;
import java.util.*;
public class countPairDiff {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = {3,5,1,2};
        int b=4;
        int count = 0;
        for(int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(int i=0; i<arr.length; i++){
            int comp = arr[i]-b;
            if(map.containsKey(comp)){
                count = count+map.get(comp);
            }
        }
        System.out.println(count);
    }
}
