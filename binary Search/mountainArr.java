public class mountainArr {
    public static void main(String[] args) {
        int arr[] = {5,17,100,200,11,2};
        int l = 0, r=arr.length-1;

        // peak element is the element which is greater than its neighbours
        while(l < r){
            int mid = l+(r-l)/2;
            if(arr[mid] < arr[mid+1]){
                l=mid+1;
            }else{
                r=mid;
            }
        }
        System.out.println(l);
        System.out.println(arr[l]);
    }
}
