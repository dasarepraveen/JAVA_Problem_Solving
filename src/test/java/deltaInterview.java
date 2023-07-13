import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class deltaInterview {
    public static void main(String[] args){
        //Write a program to print all characters in a string whose occurrence is more than once.
        //Write a program to get the frequency of characters in a string.
        //String input ="abcgadag";
        String input ="pwwkew";
        int count=1;
        int longest=0;
        char[] ar = input.toCharArray();
        Set<Character> st = new HashSet<>();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<ar.length;i++){
            if(!st.add(ar[i])){
                System.out.println(longest);
                longest=0;
                //count++;
                hm.put(ar[i],(hm.get(ar[i]))+1);
               // System.out.println(ar[i]);
                //longest=st.size();
            }
            else {
                hm.put(ar[i],count);
                longest=longest+1;
            }
            //count=0;

        }
        //longest=0;
        System.out.println(hm);
        System.out.println(longest);
        //
        //ele a
        //lis
//        res= fun(a);
//        if(!200){
//            link broken;
//        }

    }
}
