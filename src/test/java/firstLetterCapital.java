import java.util.Locale;
import java.util.Scanner;
import java.util.StringTokenizer;

public class firstLetterCapital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String fo=null;
        StringBuffer sbf = new StringBuffer();
        StringTokenizer st = new StringTokenizer(input," ");
        System.out.println("String count" +st.countTokens());
        while (st.hasMoreTokens()){
            fo=st.nextToken();
            String s = fo.substring(0, 1).toUpperCase(Locale.ROOT) + fo.substring(1);
            //System.out.println("Here "+s+fo);
            sbf.append(s).append(" ");
        }
        System.out.println(sbf.toString());
    }
}
