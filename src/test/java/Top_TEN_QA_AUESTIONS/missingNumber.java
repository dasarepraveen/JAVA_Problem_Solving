package Top_TEN_QA_AUESTIONS;

import java.util.HashSet;
import java.util.Set;

public class missingNumber {
    public static void main(String[] args){
        missingNumber mn = new missingNumber();
        int[] a = new int[]{3,0,1};
        System.out.println(mn.missingNumber(a));
    }
    public int missingNumber(int[] nums) {
        int number=0;
        int size=nums.length;
        Set<Integer> ss = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            ss.add(nums[i]);
        }
        for(int i=0;i<ss.size();i++){
            if(!ss.contains(i)){
                number=i;
            }
            else if(!ss.contains(size)){
                number=size;
            }
        }
        return number;
    }
}
