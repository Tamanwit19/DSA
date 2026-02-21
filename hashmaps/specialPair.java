package hashmaps;

import java.util.HashMap;

public class specialPair {
    public static void main(String[] args) {
        int[] arr = {7,1,3,7,1,7};

        HashMap<Integer, Integer> hp = new HashMap<>();
        int result = arr.length;

        for(int i=0; i<arr.length; i++){
            if(hp.containsKey(arr[i])){
                result = Math.min(result, Math.abs(i - hp.get(arr[i])));
            }
            hp.put(arr[i], i);
        }


        if(result==arr.length)
            System.out.println(-1);
        else
            System.out.println(result);
    }
}
