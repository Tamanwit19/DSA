public class mountainArr {
    public static void main(String[] args) {
        int arr[] = {5,17,100,11,12};
        int l = 0, r=arr.length-1;
        while(l < r){
            int mid = l+(r-l)/2;
            if(arr[mid] < arr[mid+1]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        System.out.println(arr[l]);
    }
}
