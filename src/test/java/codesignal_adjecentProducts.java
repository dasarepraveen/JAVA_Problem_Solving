import java.util.Arrays;

public class codesignal_adjecentProducts {

    public static void main(String[] args) {
        int count=0;
        int[] inputArray =  {-23, 4, -3, 8, -12};
        int[] a = new int[inputArray.length-1];
        for(int i=0;i<inputArray.length;i++){
            if((i<inputArray.length-1)){
                //int product = inputArray[i]*inputArray[i+1];
                a[count] = inputArray[i]*inputArray[i+1];
                count++;
                //max = Math.max(max, product);
            }

        }
        Arrays.sort(a);
         System.out.println(a[a.length-1]);
    }

}




