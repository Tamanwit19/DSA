public class subarrayOR {
    public static void main(String[] args) {
        int arr[] = {1,2,3};

        int sum = 0;
        int total = arr.length * (arr.length+1)/2;
        for(int i=0; i<=31; i++){
            int count = 0, zero = 0;
            // counting zero bits
            for(int j : arr){
                if((j&(1<<i)) == 0){
                    count++;
                }else{
                    zero += (count*(count+1)/2);
                    count = 0;
                }
            }
            zero += (count*(count+1)/2);
            int contri = (total - zero) * (1<<i);
            sum += contri;
        }

        System.out.println(sum);
    }
}
