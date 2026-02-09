public class singleNum1 {
    public static void main(String[] args) {
        int arr[] = {4,5,5,4,7,6,6};

        // method-1
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            ans = ans ^ arr[i];
        }

        System.out.println(ans);


        // method-2
        int un = 0;

        for(int i=0; i<=31; i++){
            int sum = 0;
            for(int j=0; j<arr.length; j++){
                if((arr[j] & (1<<i))!=0)
                    sum++;
            }
            if(sum%2!=0){
                un = (un | (1<<i));
            }
        }
        System.out.println(un);
    }
}
