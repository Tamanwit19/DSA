public class fastPower {
    public static void main(String[] args) {
        
    }
    public static int pow(int b, int e, int C){
        if(b==0 && e==0){
            return 0;
        }else if(b==0){
            return 1;
        }
        long n = pow(b, e/2, C);
        n = (n*n)%C;
        if(e%2!=0)
            n *= b % C;
        return (int)n;
    }
}
