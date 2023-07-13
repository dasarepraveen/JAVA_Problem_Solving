package Top_TEN_QA_AUESTIONS;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicate_Array {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,1,2,1,6,10,20,30,40,10};
        Set<Integer> ss = new HashSet<Integer>();
        int count=1;
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(!ss.add(arr[i])){
                count=hm.get(arr[i])+1;
                hm.put(arr[i],count);
            }
            else {
                count=1;
                hm.put(arr[i],count);
            }
        }
        Iterator it = hm.keySet().iterator();
        while (it.hasNext()){
            Object next = it.next();
            if(hm.get(next)>1){
                System.out.println("Duplicate elements are "+next);
            }

        }
        System.out.println(hm);
    }
}
