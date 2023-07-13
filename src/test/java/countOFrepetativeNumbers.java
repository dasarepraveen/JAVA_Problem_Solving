import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class countOFrepetativeNumbers {
    public static void main(String[] args){
        int count=0;
        int[] a ={1,3,5,2,4,6,1,3,4,7};
        Set<Integer> ss = new HashSet<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(!ss.add(a[i])){
                hm.put(a[i],(hm.get(a[i])+1));
            }
            else {
                hm.put(a[i],1);
            }
        }
        System.out.println(hm);




//        ArrayList<Integer> a1 = new ArrayList<Integer>();
//        for(int i=0;i<a.length;i++){
//            if(!a1.contains(a[i])){
//                a1.add(a[i]);
//                for(int j=i+1;j<a.length;j++){
//                    if(a[i]==a[j]){
//                        count++;
//                    }
//                }
//                count=count+1;
//                System.out.println("The reperated value of "+a[i] +" is "+count);
//                count=0;
//            }
//
//        }
    }
}
