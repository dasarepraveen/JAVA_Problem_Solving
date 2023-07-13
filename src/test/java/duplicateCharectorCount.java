import java.util.HashMap;
import java.util.Iterator;

public class duplicateCharectorCount {
    public static void main(String[] args){
        String input ="india is one";
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
        for(int i=0;i<input.length();i++){
            char c = input.charAt(i);
            if(hm.containsKey(c)){
                int count = hm.get(c);
                hm.put(c,count+1);
            }
            else {
                hm.put(c,1);
            }
        }
        Iterator<Character> it = hm.keySet().iterator();
        while (it.hasNext()){
            char c = it.next();
            System.out.println("Key is "+c+" count is "+hm.get(c));
        }
        System.out.println("final out put is"+hm);

    }
}
