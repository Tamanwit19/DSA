package stack;
import java.util.*;
public class prevGreater {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] arr = {4,3,2,5,1};

        int[] ans = new int[arr.length];
        int k=0;
        for(int i: arr){
            if(st.isEmpty()){
                st.push(i);
                ans[k++] = -1;
                continue;
            }
            int top = st.peek();
            while(top <= i){
                st.pop();
                if(st.isEmpty()){
                    top = -1;
                    break;
                }
                top = st.peek();
            }
            st.push(i);
            ans[k++] = top;
        }

        for(int i : ans){
            System.out.println(i);
        }
    }
}
