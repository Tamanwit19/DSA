public class pairSum {
    public static void main(String[] args) {
        int[] arr = {1,1,1};
        System.out.println(countPairs(arr, 2));
    }
    public static int countPairs(int[] arr, int B){
        int count = 0;
        int left=0, right=arr.length-1;

        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == B){
                if(arr[left]==arr[right]){
                    int c = right - left + 1;
                    int pair = c*(c-1)/2;
                    count += pair;
                    break;
                }else{
                    int c1 = 0, c2 = 0;
                    int l = arr[left];
                    int r = arr[right];

                    while(left < right && arr[left] == l){
                        c1++;
                        left++;
                    }

                    while(right >= left && arr[right] == r){
                        c2++;
                        right--;
                    }

                    int pair = c1*c2;
                    count += pair;
                }
            }
            // pointer movement
            if(sum < B){
                left++;
            }else{
                right--;
            }
        }

        return count;
    }
}
