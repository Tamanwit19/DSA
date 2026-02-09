import java.util.Scanner;

// right most set bit mask
// x+x'' = rsb mask

public class rsbMask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        sc.close();

        int onesComplement = (~x);
        int twosComplement = (onesComplement + 1);

        int rsb = (x&twosComplement);
        // int rsb = (x & -x);
        // -x = ~x+1

        System.out.println(Integer.toBinaryString(rsb));
    }
}
