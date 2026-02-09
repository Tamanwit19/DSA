public class maxAND {
    public static void main(String[] args) {
        int arr[] = {53, 39, 88};

        int ans = 0;
        for(int i=31; i>=0; i--){
            int count = 0;
            for(int j=0; j<arr.length; j++){
                if((arr[j]&(1<<i)) != 0){
                    count++;
                }
            }
            if(count >= 2){
                ans = (ans | (1<<i));
                // discarding values with unset bit
                for(int j=0; j<arr.length; j++){
                    if((arr[j]&(1<<i)) == 0){
                        arr[j] = 0;
                    }
                }
            }
        }

        System.out.println(ans);
    }
}
