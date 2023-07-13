package Top_TEN_QA_AUESTIONS;

public class slidingWindowo {
    public static void main(String[] args){
        int windowSum=0;
        int k=3;
        int[] window = new int[]{10,20,30,22,33,11};
        for(int i=0;i<k;i++){
            windowSum=windowSum+window[i];
        }
        int maxSum=windowSum;
        for(int i=k;i<window.length;i++){
            windowSum=maxSum+(window[i]-window[i-k]);
            maxSum = Math.max(maxSum,windowSum);
        }
        System.out.println(maxSum);
    }
}
