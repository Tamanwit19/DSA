package stack;

import java.util.Stack;

public class reverseString {
    public static void pushAtBottom(Stack<Character> s, char data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        char top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    public static void reverse(Stack<Character> s){
        if(s.isEmpty()) return;
        char top = s.pop();
        reverse(s);
        pushAtBottom(s, top);
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        s.push('a');
        s.push('b');
        s.push('c');
        
        reverse(s);
        System.out.println(s);
    }
}
