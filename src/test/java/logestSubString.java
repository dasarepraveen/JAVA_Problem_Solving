import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class logestSubString {
    public static void main(String[] args) {
        //Write a program to print all characters in a string whose occurrence is more than once.
        //Write a program to get the frequency of characters in a string.
        String input = "aab";
        //aab
        //abcabcbb
        //bbbbb
        //pwwkew
         int longest = 0;
          int max = 0;
          char[] ar = input.toCharArray();
          Set<Character> st = new HashSet<>();
        for (int i = 0; i < ar.length; i++){
            if (!st.add(ar[i])) {
                st.clear();
                longest = 0;

            } else {
                longest = longest + 1;
                if (longest > max) {
                    max = longest;
                }
            }
        }
        System.out.println(max);
    }
}
//        for (int i = 0; i < ar.length; i++) {
//            if(!st.add(ar[i])){
//               // st.remove(ar[i]);
//                longest=st.size();
//                if(longest>max){
//                    max=longest;
//                }
//                st.clear();
//            }
//        }
//        System.out.println(max);












