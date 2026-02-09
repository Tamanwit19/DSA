public class firstIndex {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4};
        int index = 0;
        int x = 2;
        System.out.println(findFirstIndex(arr, index, x));;
    }
    public static int findFirstIndex(int[] arr, int index, int x){
        if(index == arr.length) return -1;
        if(arr[index] == x) return index;
        return findFirstIndex(arr, index+1, x);
    }
}
