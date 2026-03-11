package stack;

import java.util.ArrayList;

public class creationArr {
    public static class Stack{
        public static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static void print(){
            if(isEmpty()){
                System.out.println("Stack Empty");
                return;
            }
            System.out.println(list.get(list.size()-1));
        }
        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack Empty");
                return;
            }
            System.out.println("Popped Data : " + list.get(list.size()-1));
            list.remove(list.size()-1);
        }
    }
    public static class StackArr{
        public static int[] arr;
        public static int pointer = 0;
        public static boolean isEmpty(){
            return arr.length==0;
        }
        public static void push(int data){
            arr[pointer++] = data;
        }
        public static void print(){
            for(int i : arr){
                System.out.println(i);
            }
        }
        public static void pop(){
            if(isEmpty()){
                System.out.println("Empty Stack");
                return;
            }
            System.out.println("Popped Data : " + arr[pointer]);
            pointer--;
        }
    }
}
