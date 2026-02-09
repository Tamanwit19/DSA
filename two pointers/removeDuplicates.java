public class removeDuplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,3,3,4,4,5,7,8,9};
        int i=1, left=0;
        while(i<arr.length){
            if(arr[i] != arr[left]){
                arr[++left] = arr[i];
            }
            i++;
        }

        for(int j=0; j<=left; j++){
            System.out.print(arr[j] + "\t");
        }
    }
}
