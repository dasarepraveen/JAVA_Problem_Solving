import java.util.ArrayList;

public class triplets {
    public static void main(String[] args){
        
        int[] arr=new int[]{ -1,0,1,2,-1,-4};
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("the triplets are "+arr[i]+" "+arr[j]+" "+arr[k]);
                        if(ar.size()<=3){
                            ar.add(arr[i]);
                            ar.add(arr[j]);
                            ar.add(arr[k]);
                        }
                        else if(!ar.contains(arr[i]) && !ar.contains(arr[j]) && !ar.contains(arr[k])){
                            ar.add(i);
                            ar.add(j);
                            ar.add(k);

                        }

                    }
                }
            }
        }
        for (Integer abcd:ar) {
            System.out.println(abcd);
        }
    }

}
