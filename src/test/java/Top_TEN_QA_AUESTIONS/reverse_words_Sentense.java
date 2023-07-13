package Top_TEN_QA_AUESTIONS;

import java.util.Scanner;
import java.util.StringTokenizer;

public class reverse_words_Sentense {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuffer sbf = new StringBuffer();
        StringTokenizer st = new StringTokenizer(input," ");
        while (st.hasMoreTokens()){
            String inputs = st.nextToken();
            sbf.append(inputs);
            System.out.println(sbf.reverse().toString());
            sbf.delete(0,inputs.length());
        }
    }
}
