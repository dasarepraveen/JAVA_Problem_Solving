package Top_TEN_QA_AUESTIONS;

public class recurssion {
    public static void main(String[] args){
        int sums=0;
        int[] values = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i:values) {
            sums = sum(i);
        }
        System.out.println(sums);

    }
    public static int sum(int val){
        if(val>0){
            return val+sum(val-1);
        }
        else {
            return 0;
        }
    }
}
