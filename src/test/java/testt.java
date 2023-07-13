import java.util.Date;

public class testt {

    public static void main(String[] args){
        String value="abc123def456";
        String nondigits="";
        String digits="";
        char[] input = value.toCharArray();
        for(int i=0;i<input.length;i++){
            if(!Character.isDigit(input[i])){
                nondigits=nondigits+input[i];
            }
            else if(Character.isDigit(input[i])){
                digits=digits+input[i];
            }
        }
        System.out.println(nondigits);
        System.out.println(Integer.parseInt(digits));
        }


}
