import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        StringBuffer sbf = new StringBuffer();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char arr[] = input.toCharArray();
        String rev="";
        for(int i=arr.length-1;i>=0;i--){
            rev=rev+arr[i];
        }
        System.out.println(rev);
//        sbf.append(input);
//        System.out.println(sbf.reverse().toString());
    }
}
