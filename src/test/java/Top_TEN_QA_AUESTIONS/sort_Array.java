package Top_TEN_QA_AUESTIONS;

public class sort_Array {
    public static void main(String[] args){
     int[] arr = new int[]{1,5,2,6,10,44,23};
     int temp;
     for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
             if(arr[i]>arr[j]){
              temp=arr[i];
              arr[i]=arr[j];
              arr[j]=temp;
             }
         }
     }
        for (int ass:arr) {
            System.out.println(ass);
        }
        System.out.println("Printing the second larges "+arr[arr.length-2]);
    }
}
