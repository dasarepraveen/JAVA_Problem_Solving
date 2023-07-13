package Top_TEN_QA_AUESTIONS;

import java.util.ArrayList;
import java.util.List;

public class slidingwindowActual {

    public static void maxofeachwindow(int[] arr,int k){
        int max=0;
        int j=k;
        List<Integer> al = new ArrayList<>();
        for(int i=0;(j-i)<=k;i++){
            j++;
            i++;
            for(int l=i;l<j;l++){
                if(arr[l]>max){
                    max=arr[l];
                }
            }
            al.add(max);
        }
        System.out.println(al);

//        int windowmax=0;
//        int start=0;
//        int end=0;
//        int max=0;
//        int count=0;
//        List<Integer> al = new ArrayList<>();
//        for(int i=0;i<arr.length-2;i=i+(k)){
//            for(int j=i;j<k;j++){
//                if(arr[j]>max){
//                    max=arr[j];
//                }
//            }
//            al.add(max);
//            max=0;
//        }
//        System.out.println(al);
    }

    public static int maxSumFromSlidingWindow(int[] arr,int k){
        int maxsum=0;
        int windowsum=0;
        int start=0;
        for(int end=0;end<arr.length;end++){
            windowsum=windowsum+arr[end];
            if(end>=k-1){
                maxsum=Math.max(windowsum,maxsum);
                windowsum=windowsum-arr[start];
                start++;
            }
        }
        return maxsum;
















//        int maxSum=0;
//        int windowSum=0;
//        int start=0;
//        for(int end=0;end<arr.length;end++){
//            windowSum=windowSum+arr[end];
//            if(end>=k-1){
//                maxSum=Math.max(windowSum,maxSum);
//                windowSum=windowSum-arr[start];
//                start++;
//            }
//        }
//        return maxSum;
    }

    public static void main(String[] args){
        int input[] = new int[]{2,7,3,5,8,1};
        int window=3;
        System.out.println(slidingwindowActual.maxSumFromSlidingWindow(input,window));
        //slidingwindowActual.maxofeachwindow(input,window);
    }
}
