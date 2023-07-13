package Top_TEN_QA_AUESTIONS;

import java.util.Scanner;

public class sumOFGivenNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[]{1,3,5,2,6,10};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==n){
                    System.out.println("two numbers are "+arr[i]+" & "+arr[j]);
                    break;
                }
            }
        }
    }
}
