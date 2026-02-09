public class printIncreasingDecreasing {
    public static void main(String[] args) {
        incDec(5);
    }
    public static void incDec(int n){
        if(n==0) return;
        System.out.println(n);
        incDec(n-1);
        System.out.println(n);
    }
}
