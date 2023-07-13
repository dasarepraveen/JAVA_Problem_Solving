package Top_TEN_QA_AUESTIONS;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class arrayIntercetion {
    public static void main(String[] args)
    {

    int[] nums1=new int[]{4,9,5};
    int[] nums2=new int[]{9,4,9,8,4};
        ArrayList<Integer> ar = new ArrayList<>();


        Set<Integer> ss = new HashSet<Integer>();
        Object[] abcd = ss.toArray();
        if(nums1.length<nums2.length){
            int count=0;
            for(int i=0;i<nums2.length;i++){
                ss.add(nums2[i]);
            }
            for(int j=0;j<nums1.length;j++){
                if(!ss.add(nums1[j])){
                    ar.add(nums1[j]);
                }
            }
        }
        else if(nums2.length<nums1.length){
            for(int i=0;i<nums1.length;i++){
                ss.add(nums1[i]);
            }
            for(int j=0;j<nums2.length;j++){
                if(!ss.add(nums2[j])){
                   ar.add(nums2[j]);
                }
            }
        }
        else if(nums2.length==nums1.length){
            for(int i=0;i<nums1.length;i++){
                ss.add(nums1[i]);
            }
            for(int j=0;j<nums2.length;j++){
                if(!ss.add(nums2[j])){
                    ar.add(nums2[j]);
                }
            }
        }
        int[] ints = new int[ar.size()];
        int i = 0;
        for (Integer n : ar) {
            ints[i++] = n;
        }
       // return ints;
        System.out.println(ar);

}
}
