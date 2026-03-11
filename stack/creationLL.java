package stack;
// linked list implementation for stack
public class creationLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    public static class Stack{
        public static Node head;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newNode = new Node(data);
            // if linked list is empty
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }
        public static void printStack(){
            if(isEmpty()){
                System.out.println("Stack Empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + ", ");
                temp = temp.next;
            }
        }
        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            } 
            System.out.println("Popped Data : " + head.data);
            head = head.next;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;
        }
    }
    public static void main(String[] args) {
        // push elements into stack
        Stack.push(1);
        Stack.push(2);
        Stack.push(3);
        // print all elements of stack
        Stack.printStack();
        // pop elements into stack
        System.out.println();
        Stack.pop();
        Stack.pop();
        // peek element
        System.out.println(Stack.peek());
    }
}
