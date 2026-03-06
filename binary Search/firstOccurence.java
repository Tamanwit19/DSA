public class firstOccurence {
    public static void main(String[] args) {
        int nums[] = {1,2,2,2,3,3,5,5,7};
        int target = 2;
        int l=0, r=nums.length-1;
        int least = Integer.MAX_VALUE;
        while(l < r){
            int mid = (l+(r-l)/2);
            if(nums[mid] == target){
                if(mid < least){
                    least = mid;
                    r = mid-1;
                }
            }else if(nums[mid] < target){
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        System.out.println(least);
    }
}
