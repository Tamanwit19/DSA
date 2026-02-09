public class primeRange {
    public static void main(String[] args) {
        
    }
    public static int[] findPrime(int n, int[][] arr){
        // seive algo
        boolean[] prime = new boolean[n+1];
        for(int i=2; i<=n; i++){
            prime[i] = true;
        }
        for(int i=2; i*i<=n; i++){
            if(prime[i]){
                for(int j=i*i; j<=n; j+=i){
                    prime[j] = false;
                }
            }
        }
        int[] prefix = new int[n+1];
        prefix[0] = 0;
        prefix[1] = 0;
        for(int i=2; i<prefix.length; i++){
            if(prime[i]){
                prefix[i] = prefix[i-1] + 1;
            }else{
                prefix[i] = prefix[i-1];
            }
        }
        int[] ans = new int[arr.length];
        int k=0;
        for(int i=0; i<arr.length; i++){
            int l = arr[i][0];
            int r = arr[i][1];
            int sum = prefix[r] - prefix[(l==0)?l:l-1];
            ans[k++] = sum;
        }

        return ans;
    }
}
