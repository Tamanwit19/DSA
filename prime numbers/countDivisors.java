public class countDivisors {
    public static void main(String[] args) {
        
    }
    public static int getDivisors(int n){

        int divisor[] = new int[n+1];

        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j+=i){
                divisor[j]++;
            }
        }

        int primeCount = 0;
        for(int i=2; i<divisor.length; i++){
            if(divisor[i] == 2){
                primeCount++;
            }
        }
        
        return primeCount;
    }
}
