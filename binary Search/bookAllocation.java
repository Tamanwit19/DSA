import java.util.Arrays;

public class bookAllocation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};
        int b=2;
        int ans=0;
        Arrays.sort(arr);
        int low=0, high=0;
        for(int i=0; i<arr.length; i++){
            low = Math.max(low, arr[i]);
            high+=arr[i];
        }

        while(low<=high){
            int mid = low+(high-low)/2;
            int count=1, sum=0;
            for(int i:arr){
                if(sum+i > mid){
                    count++;
                    sum = i;
                }else{
                    sum += i;
                }
            }
            if(count > b){
                low = mid+1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        System.out.println(ans);
    }
}
