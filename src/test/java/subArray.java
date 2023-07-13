public class subArray {
//    Given an integer array nums and an integer k, return true if nums has a continuous subarray of size at least two whose elements sum up to a multiple of k, or false otherwise.
//    An integer x is a multiple of k if there exists an integer n such that x = n * k. 0 is always a multiple of k.
//    Input: nums = [23,2,4,6,7], k = 6// 6,12,18,24
//    Output: true
//    Input: nums = [23,2,6,4,7], k = 13//13,26,29
//    Output: false
//    Input: nums = [23,2,1,6,9,7], k = 6//6,12,18,24
//    Output: true




    public static void main(String[] args){
        int[] arr = new int[]{23,2,1,6,9,7};
        int p=6;//13,26,39,52
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                    if(sum%p==0){
                        System.out.println(true);
                        break;
                    }
                }
                sum=0;
                System.out.println(" ");
            }
        }
    }
}
 /*if(arr[k]+arr[k+1]%6==0){
         System.out.println(true);
         break;
         }*/
