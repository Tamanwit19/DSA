import java.util.Scanner;

public class kerninghan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); //decimal number
        sc.close();

        int count=0;
        while(x!=0){
            int rsbm = (x&-x);
            x-=rsbm;
            count++;
        }

        System.out.println(count);
    }
}
