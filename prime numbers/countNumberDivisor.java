import java.util.ArrayList;

public class countNumberDivisor {
    public static void main(String[] args) {
        
    }
    public static int count(int[] spf, int x){

        ArrayList<Integer> list = new ArrayList<>();
        int m = x;
        while(m > 1){
            int prime = spf[m];
            list.add(prime);
            m = m/prime;
        }

        int countDivisor;
        if(list.size() > 0){
            countDivisor = 1;
        }else{
            return 1;
        }
        int c=1;
        for(int i=1; i<list.size(); i++){
            if(list.get(i)!=list.get(i-1)){
                countDivisor*=(c+1);
                c=1;
            }else{
                c++;
            }
        }
        countDivisor *= (c+1);

        return countDivisor;
    }
}
