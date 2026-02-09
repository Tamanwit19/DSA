public class singleNum2 {
    public static void main(String[] args) {
        int arr[] = {4,4,5,5,1,4,5};

        int ans = 0;
        for(int i=0; i<=31; i++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                if((arr[j]&(1<<i))!=0){
                    sum++;
                }
            }
            if(sum%3!=0){
                ans = (ans | (1<<i));
            }
        }

        System.out.println(ans);
    }
}
