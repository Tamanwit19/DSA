import java.util.ArrayList;

public class primeFactorisation {
    public static void main(String[] args) {
        
    }
    public static ArrayList<Integer> getFactor(int[] spf, int x){
        ArrayList<Integer> list = new ArrayList<>();
        int m = x;
        while(m > 1){
            int prime = spf[m];
            list.add(prime);
            m = m/prime;
        }

        return list;
    }
}
    