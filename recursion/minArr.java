public class minArr {
    public static void main(String[] args) {
        int arr[] = {-1,-2};
        System.out.println(min(arr, 0));
    }
    public static int min(int arr[], int i){
        // base case
        if(i==arr.length) return Integer.MAX_VALUE;
        int current = arr[i];
        int next = min(arr, i+1);
        return Math.min(next, current);
    }
}
