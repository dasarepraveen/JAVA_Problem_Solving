package Top_TEN_QA_AUESTIONS;

public class mergeArrays {
    public static void main(String[] args){
        int[] a1=new int[]{1,3,5,3};
        int[] a2=new int[]{0,2,4,6};
        int[] a3 = new int[a1.length+a2.length];
        int count=0;


        for(int i=0;i<a1.length;i++){
            a3[i]=a1[i];
            count++;
        }

        for(int i=0;i<a2.length;i++){
            a3[count]=a2[i];
            count++;
        }

        for(int i=0;i<a3.length;i++){
            System.out.println("-->> "+a3[i]);
        }
    }
}
