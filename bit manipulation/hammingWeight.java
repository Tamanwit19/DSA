public class hammingWeight {
    public static void main(String[] args) {
        int a = 13;
        int count = 0;
        while(a!=0){
            if((a&(1<<0))!=0){
                a-=1;
                count++;
            }else{
                a/=2;
            }
        }
        System.out.println(count);
    }
}
