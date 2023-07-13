package Top_TEN_QA_AUESTIONS;

import java.util.Scanner;

public class reverseANumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String rev="";
        int n =sc.nextInt();
        int x=n;
        while(n!=0){
            int a=n%10;
            rev=rev+String.valueOf(a);
            n=n/10;
        }
        System.out.println(rev);
        int val = Integer.parseInt(rev);
        if(val==x){
            System.out.println("Pali");
        }
        else {
            System.out.println("Not a Pali");
        }
    }
}
