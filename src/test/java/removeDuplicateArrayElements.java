import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class removeDuplicateArrayElements {
    public static void main(String[] args){
        int[] arr = {1,1,2};
        Set<Integer> ss = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            ss.add(arr[i]);
        }
        System.out.println(ss);

    }
}
