//import org.checkerframework.checker.units.qual.C;
//
//import java.util.*;
//
//public class rough {
//
//
//
//
//
//
////    public static void main(String[] args) {
////        int[] input = new int[]{1,4,3,6,7};
////        for(int i=0;i<input.length;i++){
////            for(int j=i;j<input.length;j++){
////                for(int k=i;k<=j;k++){
////                    System.out.print(input[k]);
////                }
////                System.out.println(" ");
////            }
////        }
//
//
////        int[] input = new int[]{1,4,3,6,7};
////        int k=3;
////        int winsum=0;
////        int maxsum=0;
////        int start=0;
////        for(int end=0;end<input.length;end++){
////            winsum=winsum+input[end];
////            if(end>=k-1){
////
////                maxsum=Math.max(maxsum,winsum);
////                winsum=winsum-input[start];
////                start++;
////            }
////
////
////
////        }
////        System.out.println(maxsum);
//
////        String input = "pwwkew";
////        Map<Character,Integer> hm = new HashMap<>();
////        int start=0;
////        int max=0;
////        String value=null;
////        for(int end=0;end<input.length();end++){
////            char eachvalue = input.charAt(end);
////            if(hm.containsKey(eachvalue)){
////                start = Math.max(start,hm.get(eachvalue)+1);
////            }
////            hm.put(eachvalue,end);
////            max=Math.max(max,end-start+1);
////        }
////        System.out.println(max);
//
//
//
////      String input = "pwwkew";
////      Map<Character,Integer> hm = new HashMap<>();
////      int max=0;
////      int start=0;
////      for(int end=0;end<input.length();end++){
////          char value = input.charAt(end);
////          if(hm.containsKey(value)){
////              start=Math.max(start,hm.get(value)+1);
////          }
////          hm.put(value,end);
////          max=Math.max(max,end-start+1);
////      }
////      System.out.println(max);
//    }
//}
