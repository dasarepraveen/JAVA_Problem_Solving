public class slidingWindow {
    public static void main(String[] args){
        //abcasdfehavsdasdas
        int k=3;
        int[] arr={16, 12, 9, 19, 11, 8};
        int window_sum=0;
        for(int i=0;i<k;i++)
            window_sum+=arr[i];
        int max_sum=window_sum;
        for(int i=k;i<arr.length;i++){
            window_sum=max_sum+(arr[i]-arr[i-k]);
            max_sum = Math.max(window_sum,max_sum);
        }
        System.out.println("max sum is "+max_sum);













//        int window_sum=0;
//        for(int i=0;i<k;i++)
//            window_sum=window_sum+arr[i];
//        int max_sum=window_sum;
//        for(int i=k;i<arr.length;i++){
//            window_sum=window_sum+(arr[i]-arr[i-k]);
//            System.out.println(" i is "+i+" and k is "+k+" and a[i] is"+arr[i]+" arr[i-k is "+arr[i-k]);
//            max_sum=Math.max(window_sum,max_sum);
//        }
//        System.out.println(max_sum);
    }
}
