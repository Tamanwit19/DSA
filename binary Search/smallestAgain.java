import java.util.Arrays;

public class smallestAgain {
    public static void main(String[] args) {
        int[] arr = {2,4,3,2};
        int b=3;

        Arrays.sort(arr);
        int low = arr[0]+arr[1]+arr[2];
        int high = arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
        int ans=0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int count=0;
            for(int i=0; i<arr.length-2; i++){
                int j=i+1;
                int k=arr.length-1;
                while(j<k){
                    if(arr[i]+arr[j]+arr[k] <= mid){
                        count+=(k-j);
                        j++;
                    }else{
                        k--;
                    }
                }
            }
            if(count>=b){
                ans = mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        System.out.println(ans);
    }
}
