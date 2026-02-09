public class kthSmallestElement {
    public static void main(String[] args) {
        
    }
    public static int get(int[] arr, int b){
        // using insertion sort
        for(int i=1; i<b; i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }

        return arr[b-1];
    }
}
