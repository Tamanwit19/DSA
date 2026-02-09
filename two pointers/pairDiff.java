import java.util.Arrays;

public class pairDiff {
    public static void main(String[] args) {
        
    }
    public static int getCount(int[] arr, int b){
        Arrays.sort(arr);
        int left=0, right=arr.length-1, count=0;

        while(left<right){
            int diff = (int)Math.abs(arr[left]-arr[right]);
            if(diff == b){
                count++;
                int l = arr[left];
                int r = arr[right];
                while(left < right && arr[left]==l){
                    left++;
                }
                while(right >= left && arr[right]==r){
                    right++;
                }
            }else if(diff < b){
                right--;
            }else{
                left++;
            }
        }

        return count;
    }
}
