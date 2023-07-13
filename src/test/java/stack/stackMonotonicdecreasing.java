package stack;

import java.util.Stack;

public class stackMonotonicdecreasing {
    stackMonotonicdecreasing(){

    }

    Stack<Integer> st = new Stack<>();
    public void deccreasingstock(int[] abcd){
        for(int i=0;i<abcd.length;i++){
            while(st.size()>0 && st.peek()<abcd[i]){
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
        stackMonotonicdecreasing sm = new stackMonotonicdecreasing();
        int[] arr = { 5, 17, 12, 13, 14, 10 };
        sm.deccreasingstock(arr);
        sm.displayStack();


    }
}
