public class countOfDigit {
    public static void main(String[] args) {
        System.out.println(countDigit(123));
    }
    public static int countDigit(int n){
        if(n==0) return 0;
        return 1 + countDigit(n/10);
    }
}
