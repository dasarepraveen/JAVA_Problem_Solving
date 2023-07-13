import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap {
    public static void main(String[] args){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"abcd");
        hm.put(2,"efgh");
        hm.put(3,"ijkl");
        hm.put(4,"mnop");
        hm.put(5,"qrst");
        hm.put(6,"uvwx");
        hm.put(null,null);
        hm.put(6,null);
        hm.put(77,null);
        Iterator it = hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry mp =(Map.Entry)it.next();
            System.out.println("Key "+mp.getKey());
            System.out.println("vlaue "+mp.getValue());
        }
    }
}

//
// <input id="search_form_input_homepage" class="js-search-input search__input--adv"
// type="text" autocomplete="off"
// name="q" tabindex="1" value="" autocapitalize="off" autocorrect="off">
