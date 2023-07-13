package Collections;

import java.util.*;

public class arraylists {
    public static void main(String[] args){
        List<Integer> ar = new ArrayList<>();
        List<Integer> ar1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n=5;
        for(int i=0;i<n;i++){
            ar.add(4);
            ar1.add(5);
        }
        ar.add(5, 10);
        System.out.println("array1 "+ar);
//        Object[] ss =  ar.toArray();
//        ar.addAll(ar);
//        System.out.println(ar);
//        System.out.println(ar.containsAll(ar));
//        System.out.println(ar.contains(10));
//        Iterator<Integer> it = ar.listIterator();
//        Iterator<Integer> it1 = ar.iterator();
//        while (it.hasNext() && it1.hasNext()) {
//            System.out.println(it.next() + "**" + it1.next());
//        }
        List<Integer> ar3 = new ArrayList<>();
        ar3 = ar.subList(0,2);
        System.out.println("Sublist is "+ar3);
        Set<Integer> set = new LinkedHashSet<>(ar);
        ar.clear();
        ar.addAll(set);
        Set<Integer> ssss = new HashSet<>(ar1);
        System.out.println("Setvalues are "+ssss);


        System.out.println("Finalayy "+ar);
    }
}
