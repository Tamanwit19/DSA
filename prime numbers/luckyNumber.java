public class luckyNumber {
    public static void main(String[] args) {
        
    }
    public static int solve(int A){
        int[] div = new int[A+1];

        for(int i=2; i<=A; i++){
            if(div[i]==0){
                for(int j=i; j<=A; j+=i){
                    div[j]++; // for i dividing j
                }
            }
        }

        int ans = 0;
        for(int i=1; i<=A; i++){
            if(div[i]==2){
                ans++;
            }
        }

        return ans;
    }
}
