public class allIndices {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5,2};
        int narr[] = indices(arr, 0, 2);
        for(int i : narr){
            if(i!=-1)
                System.out.println(i);
        }
    }
    public static int[] indices(int[] arr, int index, int target){
        // base case
        if(index == arr.length) return arr;
        // array modification
        if(arr[index] == target){
            arr[index] = index;
        }else{
            arr[index] = -1;
        }

        return indices(arr, index+1, target);

    }
}