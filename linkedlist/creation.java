package linkedlist;

public class creation {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addNodeFront(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void addNodeEnd(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Linked List is empty");
    }
    public static void insertIndex(int index, int data){
        if(index==0){
            addNodeFront(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int count = 0;
        while(count < index-1){
            count++;
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if(newNode.next == null){
            tail = newNode;
        }
    }
    public static int getSize(){
        if(head==null){
            return 0;
        }
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void removeFirst(){
        if(size == 0){
            System.out.println("Linked List is Empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }
        head = head.next;
        size--;
        return;
    }
    public static void removeLast(){
        if(head == null){
            System.out.println("Linekd List is Empty");
            return;
        }
        if(head.next == null){
            head = tail = null;
            size = 0;
            return;
        }
        Node temp = head;
        int c = 0;
        while(c != size-2){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return;
    }
    public static boolean iterativeSearch(int value){
        if(head == null){
            System.out.println("Linked List is empty");
            return false;
        } 
        if(size == 1){
            if(head.data == value)
                return true;
            else
                return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public static boolean recursiveSearch(int value){
        return helper(head, value);
    }
    public static boolean helper(Node head, int value){
        if(head == null){
            return false;
        }
        if(head.data == value)
            return true;
        boolean result = helper(head.next, value);
        return result;
    }
    public static void reverse(){
        
    }
    
    public static void main(String[] args) {
        addNodeFront(1);
        addNodeFront(2);
        addNodeFront(3);
        addNodeEnd(0);
        insertIndex(4, 15);
        addNodeEnd(8);
        addNodeEnd(9);
        display();
        System.out.println(getSize());
        System.out.println(iterativeSearch(15));
        System.out.println(recursiveSearch(7));
    }
}
