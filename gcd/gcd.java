public class gcd {
    public static void main(String[] args) {
        
    }
    public static int get(int a, int b){
        if(b==0){
            return a;
        }
        int r = get(b, a%b);
        return r;
    }
}
