import java.util.Scanner;

public class printDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print descending order : ");
        int n = sc.nextInt();
        sc.close();
        decreasing(n);
    }
    public static void decreasing(int n){
        if(n==0) return;
        System.out.println(n);
        decreasing(n-1);
    }
}
