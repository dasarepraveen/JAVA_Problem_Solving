package Top_TEN_QA_AUESTIONS;
import java.util.*;
import java.io.*;
//Exception in thread "main" java.util.NoSuchElementException: No line found
//        at java.base/java.util.Scanner.nextLine(Scanner.java:1651)
//        at Main.main(Main.java:43)

public class tetststsst {
// System.out.print(StringChallenge(s.nextLine(),s.nextLine()));
    public static String StringChallenge(String str1, String str2) {
            String output="false";
            int count=0;
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){

                    output="true";

            }
            if(ch1.length>ch2.length){
                for(int i=0;i<ch2.length;i++){
                    if(str1.contains(Character.toString(ch2[i]))){
                        count++;
                    }
                }
                if(count==ch2.length){
                    output="true";
                }
            }
            else if(ch2.length>ch1.length){
                for(int i=0;i<ch1.length;i++){
                    if(str2.contains(Character.toString(ch1[i]))){
                        count++;
                    }
                }
                if(count==ch1.length){
                    output="true";
                }
            }
            return output;
        }

        public static void main (String[] args) {
            // keep this function call here
            Scanner s = new Scanner(System.in);
            System.out.println(StringChallenge(s.nextLine(),s.nextLine()));
        }

    }

