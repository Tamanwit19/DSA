public class printSubsequence {
    public static void main(String[] args) {
        print("abc", "");
    }
    public static void print(String str, String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char c = str.charAt(0);
        String ros = str.substring(1);

        print(ros, ans+"");
        print(ros, ans+c);
    }
}
