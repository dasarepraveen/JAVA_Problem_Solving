package Top_TEN_QA_AUESTIONS;

import java.util.HashMap;
import java.util.Scanner;

public class Revers_Pallindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] arr = input.toCharArray();
        String rev="";
        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
        }
        System.out.println(rev);
        if(input.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
