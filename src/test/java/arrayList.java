import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args){
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Abcd");
        ar.add("AYZ");
        ar.add("Arun");
        ar.add("Ashish");
        ar.add("XYZ");
        Long cc = ar.stream().filter(x->x.startsWith("A")).count();
        System.out.println(cc);
    }
}
