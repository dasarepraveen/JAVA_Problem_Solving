package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class exploreSet {
    public static void main(String[] args){
        Set ss = new HashSet();
        ss.add(1);
        ss.add(2);
        ss.add(3);
        ss.add(4);
        ss.add(5);
        ss.add(6);
        ss.add(6);
        ss.add(7);
        Collections.sort(Arrays.asList(ss.toArray()),null);




    }
}
