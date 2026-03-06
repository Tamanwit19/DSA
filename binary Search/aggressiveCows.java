import java.util.Arrays;

public class aggressiveCows {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int b=3;

        Arrays.sort(arr);
        int low = 1;
        int high = arr[arr.length-1];
        int ans = 0;

        while(low<=high){
            int mid = low+(high-low)/2;
            int count=1, current=0;
            for(int i=0; i<arr.length; i++){
                if(arr[i]-arr[current]>=mid){
                    count++;
                    current = i;
                }
            }
            if(count>=b){
                ans = mid;
                low = mid+1;

            }else{
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
