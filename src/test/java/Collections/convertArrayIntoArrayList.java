package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class convertArrayIntoArrayList {
    public static void main(String[] args){
        String[] st = new String[]{"abcd","efgh","asdsad"};
        ArrayList<String> ar = new ArrayList<>(Arrays.asList(st));
        System.out.println(ar);
    }
}
