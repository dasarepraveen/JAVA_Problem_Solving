package Top_TEN_QA_AUESTIONS;

import java.util.*;

public class count_Occurrence_Of_Word {
    public static void main(String[] args){
        int count=1;
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        Scanner sc = new Scanner(System.in);
        String addvalue=null;
        String input = sc.nextLine();
        StringTokenizer st = new StringTokenizer(input," ");
        Set<String> ss = new HashSet<String>();
        while (st.hasMoreTokens()){
            addvalue = st.nextToken();
            if(!ss.add(addvalue)){
                count=hm.get(addvalue)+1;
                hm.put(addvalue,count);
            }
            else {
                hm.put(addvalue,count);
            }
            count=1;

        }
        Iterator it = hm.keySet().iterator();
        while (it.hasNext()){
            Object nextvalue = it.next();
            System.out.println("using it "+nextvalue.toString()+ " - " +hm.get(nextvalue));
        }

        System.out.println(hm);
    }
}
