package stack;

import java.util.Stack;

public class stackMonotonicIncreasing {
    stackMonotonicIncreasing(){

    }

    Stack<Integer> st = new Stack<>();
    public void increasingstock(int[] abcd){
        for(int i=0;i<abcd.length;i++){
            while(st.size()>0 && st.peek()>abcd[i]){
                st.pop();
            }
            st.push(abcd[i]);
        }
    }
    public void displayStack(){
        int n = st.size();
       for(int i=0;i<n;i++){
           System.out.println("new stack values are "+st.pop());
       }
    }

    public static void main(String[] args){
        stackMonotonicIncreasing sm = new stackMonotonicIncreasing();
        int[] arr = { 1, 4, 5, 3, 12, 10 };
        sm.increasingstock(arr);
        sm.displayStack();


    }
}
