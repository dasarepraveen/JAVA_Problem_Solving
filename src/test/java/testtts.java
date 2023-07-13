public class testtts {
    public static void main(String[] args){
        String input = "my name is praveen";
        char[] ch = input.toCharArray();
        int len = ch.length-1;
        for(int i=len;i>=0;i--){
            if(!Character.isSpaceChar(ch[i])){
                System.out.print(ch[i]);
            }
        }
    }
}
//
