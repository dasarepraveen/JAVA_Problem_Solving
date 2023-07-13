public class subArrayInterview {
    public static void main(String[] args){
        //int[] arr = new int[]{13,26,39,52};
        int[] arr = new int[]{23,2,1,6,9,7};
        int p=6;//13,26,39,52
        int window=2;
        int sum=0;
        int windowSum=0;
        int maxSum=0;
        for(int i=0;i<window;i++){
            windowSum=windowSum+arr[i];
        }
        maxSum=windowSum;
        for(int i=window;i<arr.length;i++){
            windowSum=windowSum+(arr[i]-arr[i-window]);
            maxSum=Math.max(windowSum,maxSum);
            if(maxSum%p==0)
            {
                System.out.println("yes");
                break;
            }
            else{
                System.out.println("yes");
            }
        }
        System.out.println(maxSum);
    }
}
