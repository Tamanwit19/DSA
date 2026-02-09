public class maxArr {
    public static void main(String[] args) {
        int arr[] = {-59};
        System.out.println(max(arr, 0));
    }
    public static int max(int arr[], int i){
        // base case
        if(i==arr.length) return Integer.MIN_VALUE;
        int current = arr[i];
        int next = max(arr, i+1);
        return Math.max(next, current);
    }
}
