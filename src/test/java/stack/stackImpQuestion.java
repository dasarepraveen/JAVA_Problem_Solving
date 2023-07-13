package stack;

import java.util.Stack;

public class stackImpQuestion {
    public static void main(String[] args){
        Stack<Character> st = new Stack<>();
        boolean value=false;
        String input ="{ [] {} () } }";
        for(int i=0;i<input.length();i++){
            switch (input.charAt(i)){
                case '{':
                case '[':
                case '(':
                    st.push(input.charAt(i));
                    break;
                case '}':
                    if(st.empty()||!st.pop().equals('}')){
                        value=false;
                    }
                    break;
                case ']':
                    if(st.empty()||!st.pop().equals(']')){
                        value=false;
                    }
                    break;
                case ')':
                    if(st.empty()||!st.pop().equals(')')){
                        value=false;
                    }
                    break;
            }
        }
        System.out.println("The size is "+st.empty());
    }
}
