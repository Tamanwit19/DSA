public class subarrayOR {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        int ans = 0;
        int total = arr.length*(arr.length+1)/2;
        for(int i=0; i<=31; i++){
            int count=0;
            int zero=0;
            for(int j:arr){
                if((j&(1<<i))==0)
                    count++;
                else{
                    zero += (count*(count+1)/2);
                    count=0;
                }
            }
            int contri = total-zero;
            ans = ans+(contri*(1<<i));
        }

        System.out.println(ans);
    }
}
