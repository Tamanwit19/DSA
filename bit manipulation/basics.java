import java.util.Scanner;

public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int onBit = sc.nextInt();
        int offBit = sc.nextInt();
        int toggleBit = sc.nextInt();
        int checkBit = sc.nextInt();

        sc.close();
        
        int onMask = (1 << onBit);
        int offMask = ~(1 << offBit);
        int toggleMask = (1 << toggleBit);
        int checkMask = (1 << checkBit);

        System.out.println((n | onMask));
        System.out.println((n & offMask));
        System.out.println((n ^ toggleMask));
        System.out.println((n & checkMask) != 0 ? false : true);
    }
}
