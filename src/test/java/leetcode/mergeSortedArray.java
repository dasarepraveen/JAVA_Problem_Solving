package leetcode;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args){
        int[] nums1={0};
        int[] nums2={1};
        int m=0;
        int n=1;
        mergeSortedArray me = new mergeSortedArray();
        me.merge(nums1,m,nums2,n);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int count=0;
        int countt=0;
        if(m>0&&n>0){
            for(int i=0;i<nums1.length;i++){
                if(nums1[i]==0 && nums1.length>1){
                    nums1[i]=nums2[count];
                    count++;
                   /* for(int j=0;j<nums2.length;j++){
                        nums1[i]=nums2[j];
                    }*/
                }
            }
            Arrays.sort(nums1);
            System.out.println(nums1);
        }
        else if(m>0&&n<=0){
            Arrays.sort(nums1);
            System.out.println(nums1);
        }
        else if(m==0){
            for(int i=0;i<nums2.length;i++){
                nums1[i]=nums2[i];
                countt++;
            }
            Arrays.sort(nums1);
            //nums1[]
            System.out.println(nums2);
        }
    }
}
