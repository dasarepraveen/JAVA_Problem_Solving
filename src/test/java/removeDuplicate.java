import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class removeDuplicate {
    public static void main(String[] args){
        String input= "abcdefassb";
        String op="";
        //Set<Character> ss = new HashSet<Character>();
        Set<Character> ss = new LinkedHashSet<>();
        for(int i=0;i<input.length();i++){
            ss.add(input.charAt(i));
        }
        Iterator<Character> it =ss.iterator();
        while (it.hasNext()){
            op=op+it.next();
        }
        System.out.println(input);
        System.out.println(op);
        System.out.println(ss);
    }
}
