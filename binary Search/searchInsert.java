public class searchInsert {
    public static void main(String[] args) {
        int nums[] = {1,3,5,6};
        int target = 4;


        int index = -1, l=0, h=nums.length-1;
        while(l < h){
            int mid = (l+(h-l))/2;
            if(nums[mid] == target){
                index = mid;
                System.out.println(index);
                return;
            }
            else if(nums[mid] < target){
                l = mid+1;
                index = l;
            }else{
                h = mid-1;
                index = h;
            }
        }
        System.out.println(index+1);
    }
}
