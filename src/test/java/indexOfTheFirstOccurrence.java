import java.util.ArrayList;
import java.util.Collections;

public class indexOfTheFirstOccurrence {
    int min=0;
    ArrayList<Integer> ar = new ArrayList<>();

    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            int index = haystack.indexOf(needle);
            ar.add(index);
            Collections.sort(ar);
            min=ar.get(0);

        }
        else {
            min=-1;
        }
        return min;


    }
    public static void main(String[] args){
        indexOfTheFirstOccurrence io = new indexOfTheFirstOccurrence();
       System.out.println(io.strStr("leetcode","leeto"));

    }
}
