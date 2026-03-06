public class magicNumber {
    public static void main(String[] args) {
        int n = 10;
        int ans = 0;
        for(int i=0; i<=31; i++){
            if((n&(1<<i))!=0){
                ans += (int)Math.pow(5, i+1);
            }
        }
        System.out.println(ans);
    }
}
