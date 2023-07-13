package Top_TEN_QA_AUESTIONS;

public class reverseArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,4,6,3,2,66,7};
        int temp=0;
        int len = arr.length-1;
       for(int i=0;i<arr.length/2;i++){
           temp=arr[len-i];
           arr[len-i]=arr[i];
           arr[i]=temp;
       }
        for (int aa:arr) {
            System.out.println("Output is "+aa);

        }
    }
}
