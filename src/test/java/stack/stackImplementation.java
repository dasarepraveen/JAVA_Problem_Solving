package stack;

import java.util.Stack;

public class stackImplementation {
    public void push(Stack<Integer> st){
        for(int i=0;i<5;i++){
            st.push(i);
        }
    }
    public void pop(Stack<Integer> st){
        for(int i=0;i<5;i++){
            System.out.println(st.pop());
        }
    }
    public void peep(Stack<Integer> st){
        System.out.println("Peek value is "+st.peek());
    }
     public void serch(Stack<Integer> st,int value){
       int pos =  st.search(value);
       System.out.println("Search index is "+pos);
     }

    public static void main(String[] args){
        stackImplementation sm = new stackImplementation();
        Stack<Integer> st = new Stack();
        sm.push(st);
        sm.pop(st);
        sm.push(st);
        sm.peep(st);
        sm.serch(st,0);
    }
}
