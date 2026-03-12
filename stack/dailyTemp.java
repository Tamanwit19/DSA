package stack;

import java.util.Stack;

public class dailyTemp {
    public static void main(String[] args) {
        // return ans[i] representing how many days required to wait for a warmer day
        int[] arr = {73,74,75,71,69,72,76,73};
        Stack<Integer> st = new Stack<>();
        Stack<Integer> idx = new Stack<>();

        // non-circular array
        int[] ans = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            int value = arr[i];
            while(!st.isEmpty() && st.peek() <= value){
                st.pop();
                idx.pop();
            }
            if(st.isEmpty()) 
                ans[i] = 0;
            else 
                ans[i] = idx.peek() - i;
            st.push(value);
            idx.push(i);
        }
    }
}
