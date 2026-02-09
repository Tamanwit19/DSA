import java.util.ArrayList;

public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,0,0,1,1,1};
        System.out.println(maxone(arr, 2));
    }
    public static ArrayList<Integer> maxone(int[] A, int B) {
        // B is the number of replacements
        int zero = 0, left = 0, start = 0, last = 0;
        for(int i=0; i<A.length; i++){
            if(A[i]==0){
                zero++;
            }
            while(zero > B){
                if(A[left] == 0){
                    zero--;
                }
                left++;
                start = left;
            }
            last = i;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = start; i<=last; i++){
            list.add(i);
        }
        return list;
    }
}