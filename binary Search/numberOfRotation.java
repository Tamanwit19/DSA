public class numberOfRotation {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int low=0, high=arr.length-1;
        while(low < high){
            int mid = low+(high-low)/2;
            if(arr[mid] > arr[high]){
                low = mid+1;
            }else{
                high = mid;
            }
        }
        // number of rotation
        System.out.println(low);
    }
}
