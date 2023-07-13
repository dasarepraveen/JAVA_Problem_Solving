package Top_TEN_QA_AUESTIONS;

public class fib {
    public static void main(String[] args){
        //0,1,1,2,3,5,8
        int sum=0;
        int i=0;
        int j=1;
        int k=1;
        int n=25;
        for(int l=0;l<=n;l++){
            if(l>2){
                sum=i+j+k;
                i=j;
                j=k;
                k=sum;
                //j=sum;
                System.out.println(sum);
            }
            else {
                System.out.println(k);
            }
        }
    }
}
