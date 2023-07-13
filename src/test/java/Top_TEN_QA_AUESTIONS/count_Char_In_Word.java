package Top_TEN_QA_AUESTIONS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class count_Char_In_Word {
    public static void main(String[] args){
        int count=1;
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] arr = input.toCharArray();
        Set<Character> ss = new HashSet<Character>();
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<arr.length;i++){
            if(!ss.add(arr[i])){
                count = hm.get(arr[i])+1;
                hm.put(arr[i],count);
            }
            else{
                count=1;
                hm.put(arr[i],count);
            }
        }
        System.out.println("Outputs is "+hm);
    }
}
