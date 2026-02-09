public class linearPower {
    public static void main(String[] args) {
        System.out.println(ans(2,5));
        System.out.println(log(2, 5));
    }
    public static int ans(int x, int n){
        if(n==0) return 1;
        int p = ans(x, n-1);
        int a = x * p;
        return a;
    }
    // logarithmic approach
    public static int log(int x, int n){
        if(n==0) return 1;
        // 2^5 = 2^2 * 2^2 * 2
        // 2^4 = 2^2 * 2^2
        int product = log(x, n/2) * log(x, n/2);
        if(n%2!=0)
            product *= x;

        return product;
    }
}
