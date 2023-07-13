package Top_TEN_QA_AUESTIONS;

import java.util.Arrays;
import java.util.Collections;

public class Min_MAX_Array {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,1,2,1,6,10,20,30,40,10};
        int max1=-1234;
        int max2=-123;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max1){
                max1=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max2&&arr[i]<max1){
                max2=arr[i];
            }
        }
        System.out.println("Second largest is "+max2);
        Arrays.sort(arr);
        System.out.println("Min is "+arr[0]+" Max is "+arr[arr.length-1]);
    }
}
