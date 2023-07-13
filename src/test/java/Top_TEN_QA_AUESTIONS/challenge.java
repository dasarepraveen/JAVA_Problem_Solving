package Top_TEN_QA_AUESTIONS;

public class challenge {
    public static void main(String[] args){
        int temp=0;
        String tempString=null;
        int[] a = new int[]{10,30,18,18};
        String[] st = new String[]{"Ram","Sham","Shashi","bham"};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                    tempString=st[j];
                    st[j]=st[i];
                    st[i]=tempString;
                }
            }
        }
        for (int aa:a) {
            System.out.println(aa);
        }
        for (String ss:st
             ) {System.out.println(ss);

        }

    }
}
