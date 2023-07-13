package Top_TEN_QA_AUESTIONS;

import java.util.*;

public class indexOfNonRepeatingChar {
    public static void main(String[] args){
        String s = "loveleetcode";
        //String s = "leetcode";
        char[] ch = s.toCharArray();
        LinkedHashSet<Character> ss = new LinkedHashSet<>();
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(!ss.add(ch[i])){
                hm.put(ch[i],(hm.get(ch[i]))+1);
            }
            else {
                hm.put(ch[i],1);
            }
        }
        System.out.println(hm);
        Iterator<Character> it = ss.iterator();
        while (it.hasNext()){
            Character ccc =it.next();
            System.out.println(ccc);
            if(hm.get(ccc)==1){
                System.out.println(ccc);
                break;
            }
        }
        //System.out.println(ss);
    }
}
