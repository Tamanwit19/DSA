import java.util.ArrayList;

public class keypad {
    public static void main(String[] args) {
        String key[] = {"?!", "abc", "def", "ghi", "jkl", "mnop", "qrst", "uv", "wxyz", ".,"};
        ArrayList<String> list = getComb("573", key);
        System.out.println(list);
    }
    public static ArrayList<String> getComb(String s, String[] key){
        // base case
        if(s.length() == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        int index = Integer.parseInt(s.charAt(0)+"");
        char ch[] = key[index].toCharArray();
        String ros = s.substring(1);
        ArrayList<String> cres = getComb(ros, key);
        ArrayList<String> mres = new ArrayList<>();
        for(char c : ch){
            for(String res : cres){
                mres.add(c + "" + res);
            }
        }
        return mres;
    }
}
