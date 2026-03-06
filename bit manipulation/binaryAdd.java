public class binaryAdd {
    public static void main(String[] args) {
        String a = "1001";
        String b = "1001";

        int carry = 0;
        int sum = 0;

        int i = a.length()-1;
        int j = b.length()-1;

        StringBuilder sb = new StringBuilder("");

        while(i>=0 || j>=0 || carry == 1){
            int x = (i>=0) ? a.charAt(i--) - '0' : 0;
            int y = (j>=0) ? b.charAt(j--) - '0' : 0;
            sum = x+y+carry;

            sb.append(sum%2);            
            carry = sum/2;
        }

        System.out.println(Integer.parseInt(sb.reverse().toString(), 2));
    }
}
