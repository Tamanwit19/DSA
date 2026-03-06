public class painterPartition {
    public static void main(String[] args) {
        int[] arr = {1,8,11, 3};
        int a=10;
        int low=0, high=0;
        for(int i:arr){
            low = Math.max(low, i);
            high+=i;
        }
        int ans = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            int count = 1;
            int sum = 0;
            for(int i : arr){
                if(sum+i > mid){
                    sum = i;
                    count++;
                }else{
                    sum+=i;
                }
            }
            if(count<=a){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(ans);
    }
}
