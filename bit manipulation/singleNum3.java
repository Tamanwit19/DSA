public class singleNum3 {
    public static void main(String[] args) {
        int arr[] = {4,4,5,5,1,6,6,2};

        int value = arr[0];
        for(int i=1; i<arr.length; i++){
            value = value ^ arr[i];
        }

        // value > 011

        int rsbm = (value & -value);
        int a=0, b=0;
        for(int i : arr){
            if((i&rsbm)!=0){
                a^=i;
            }else{
                b^=i;
            }
        }

        System.out.println(a + ", " + b);
    }
}
