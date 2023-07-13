package Top_TEN_QA_AUESTIONS;

import java.util.HashMap;

public class leetcode {
    public String longestPalindrome(String s) {
        String rev="";
        int max=0;
        HashMap<Integer,String>hm = new HashMap<>();
        char[] ch = s.toCharArray();
        StringBuffer sbf = new StringBuffer();
        for(int i=0;i<ch.length;i++){
            rev=rev+ch[i];
            sbf.append(rev);
            if(rev.length()>1 && rev.equalsIgnoreCase(sbf.reverse().toString())){
                if(rev.length()>max){
                    max=rev.length();
                    hm.put(max,rev);
                }
            }
            else if(i<ch.length-1 && ch[i]==ch[i+1]){
                String edgeCase="";
                edgeCase=edgeCase+ch[i]+ch[i+1];
                max=edgeCase.length();
                hm.put(max,edgeCase);
            }
            sbf.delete(0,rev.length());
        }
        System.out.println(hm.get(max));
        return hm.get(max);
    }

    public static void main(String[] args){
        leetcode lc =  new leetcode();
        System.out.println(lc.longestPalindrome("caba"));
    }

}
