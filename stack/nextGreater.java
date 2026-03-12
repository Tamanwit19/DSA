package stack;

import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int arr[] = {1,2,1};
        int n = arr.length;
        for(int i=2*n-1; i>=n; i--){
            int value = arr[i%n];
            while (!st.isEmpty() && st.peek() <= value) {
                st.pop();
            }
            st.push(value);
        }
        int[] ans = new int[n];
        for(int i=n-1; i>=0; i--){
            int value = arr[i];
            while(!st.isEmpty() && st.peek() <= value){
                st.pop();
            }
            if(st.isEmpty()) 
                ans[i] = -1;
            else 
                ans[i] = st.peek();
            st.push(value);
        }
    }
}
