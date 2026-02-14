public class minSortedArr {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int low=0, high = arr.length-1;

        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }else{
                high=mid;
            }
        }
        // minimum element
        System.out.println(arr[low]);
    }
}
