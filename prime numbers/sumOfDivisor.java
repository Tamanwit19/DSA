// important question
public class sumOfDivisor {
    public static void main(String[] args) {
        
    }
    public static int sum(int[] spf, int x){
        if(x==1) return 1;

        int m = x;
        int ans = 1;

        while(m > 1){
            int prime = spf[m];
            int pcount = 0; 
            while (m%prime == 0) {
                pcount++;
                m = m/prime;
            }
            int currentSum = 0;
            int pPow = 1;

            for(int i=0; i<=pcount; i++){
                currentSum += pPow;
                pPow *= prime;
            }
            ans *= currentSum;
        }   

        return ans;
    }
}
