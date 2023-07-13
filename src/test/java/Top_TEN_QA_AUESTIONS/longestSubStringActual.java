package Top_TEN_QA_AUESTIONS;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class longestSubStringActual {
    String rev=null;
    public static int longestvalueofnonrepeatingsubstring(String input){
        StringBuffer sbf =new StringBuffer();
        int start=0;
        int max=0;
        String rev="";
        String nextvalue=null;
        Map<Character,Integer> map = new HashMap<>();
        Iterator it = map.keySet().iterator();
        for(int end=0;end<input.length();end++){
            char eachvalue = input.charAt(end);
            if(map.containsKey(eachvalue)){
                start= Math.max(start,map.get(eachvalue)+1);
//                while (it.hasNext())
//                rev=rev+it.next();
            }
            map.put(eachvalue,end);
            max=Math.max(max,(end-start)+1);
//            while (it.hasNext()){
//                nextvalue = it.next().toString();
//            }
//            rev = rev+nextvalue;
//            System.out.println(rev);
//            String mapvalues = map.get(eachvalue).toString();
//            sbf.append(mapvalues);
//            if(mapvalues.equalsIgnoreCase(sbf.reverse().toString())){
//                System.out.println("longes substring is "+ mapvalues + "and length is "+mapvalues.length());
//            }

        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(longestvalueofnonrepeatingsubstring(input));

    }
}
