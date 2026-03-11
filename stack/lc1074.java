package stack;

import java.util.Stack;

public class lc1074 {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        String s = "abbaca";

        for(char ch : s.toCharArray()){
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }
            if(st.peek() == ch){
                st.pop();
                continue;
            }
            st.push(ch);
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = st.pop() + ans;
        }
        System.out.println(ans);
    }
}
