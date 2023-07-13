package Top_TEN_QA_AUESTIONS;

import java.util.Scanner;

public class anagram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string1 = sc.next();
        String string2 = sc.next();
        int count=0;
        for(int i=0;i<string1.length();i++){
            Character ch;
            ch = string1.charAt(i);
            if(string2.contains(Character.toString(ch))){
                count++;
            }
            //ch=null;
        }
        if(string1.length()==count && string2.length()==count){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        char ch='a';
        System.out.println("checking "+Character.isLetter(ch));

    }
}
