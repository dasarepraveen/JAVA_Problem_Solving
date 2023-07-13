package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setinterface {
    public static void main(String[] args){
      Set<Integer> ss = new HashSet<>();
        Set<Integer> sl = new LinkedHashSet<>();
        Set<Integer> st = new TreeSet<>();
        ss.add(55);
        ss.add(33);
        ss.add(88);
        ss.add(100);
        ss.add(12);
        ss.add(77);

        System.out.println("************"+ss);

        sl.add(55);
        sl.add(33);
        sl.add(88);
        sl.add(100);
        sl.add(12);
        sl.add(77);

        System.out.println("************"+sl);

        st.add(55);
        st.add(33);
        st.add(88);
        st.add(100);
        st.add(12);
        st.add(77);

        System.out.println("************"+st);


    }
}
