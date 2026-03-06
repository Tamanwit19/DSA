package hashmaps;

import java.util.*;

public class disticntNumber {
    public static void main(String[] args) {
        // sliding window + hashmaps
        HashMap<Integer, Integer> map = new HashMap<>();
        int b=3;

        int arr[] = {1,2,1,3,4,3};
        int low = 0, high = b;
        for(int i=low; i<high; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(map.size());
        while(high<arr.length){
            int count = map.get(arr[low]);
            if(count==1)
                map.remove(arr[low]);
            else
                map.put(arr[low], count-1);

            map.put(arr[high], map.getOrDefault(arr[high], 0)+1);
            list.add(map.size());
            low++;
            high++;
        }
        System.out.println(list);
    }
}
