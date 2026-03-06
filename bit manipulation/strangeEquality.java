public class strangeEquality {
    public static void main(String[] args) {
        int A = 10;
        int h = Integer.highestOneBit(A);
        int x = (~A)&(h-1);
        long y = (long) h<<1;
        System.out.println((int)(x^y));
    }
}
