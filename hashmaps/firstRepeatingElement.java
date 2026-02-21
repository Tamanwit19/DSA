package hashmaps;

import java.util.HashMap;

public class firstRepeatingElement {
    public int solve(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minValue = -1, minIdx = Integer.MAX_VALUE;
        for(int i=0; i<A.length; i++){
            if(map.containsKey(A[i])){
                if(minIdx > map.get(A[i])){
                    minIdx = map.get(A[i]);
                    minValue = A[i];
                }
                continue;
            }
            map.put(A[i], i);
        }

        return minValue;
    }
}
