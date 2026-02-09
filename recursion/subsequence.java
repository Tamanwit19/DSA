import java.util.*;

public class subsequence {
    public static void main(String[] args) {
        ArrayList<String> list = getSub("abc");
        System.out.println(list);

    }
    public static ArrayList<String> getSub(String s){
        // base case
        if(s.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char f = s.charAt(0);
        String ros = s.substring(1);
        ArrayList<String> cres = getSub(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        for(String res : cres){
            mres.add(res);
            mres.add(f+""+res);
        }
        return mres;
    }
}
