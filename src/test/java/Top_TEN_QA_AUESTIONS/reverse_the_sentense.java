package Top_TEN_QA_AUESTIONS;

import java.util.Scanner;
import java.util.StringTokenizer;

public class reverse_the_sentense {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sbf = new StringBuffer();
        String[] abcd = input.split(" ");
        for(int i=abcd.length-1;i>=0;i--){
            System.out.print(abcd[i]+" ");
        }
    }
}
