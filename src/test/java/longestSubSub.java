import java.util.HashSet;

public class longestSubSub {
    public static void main(String[] args){
        //String s = "bbb";
        String s = "abcabcbb";
        //abcabcbb
        int i=0, j=0;
        int n = s.length();
        int ans =0;
        HashSet<Character> hs = new HashSet<>();
        while(i<s.length() && j<s.length()){
            if(!hs.contains(s.charAt(j))){
                hs.add(s.charAt(j));
                j++;
                ans=Math.max(ans,(j-i));
            }else {
                hs.remove(s.charAt(i));
                i++;
            }
        }
        System.out.println(ans);

    }
}
