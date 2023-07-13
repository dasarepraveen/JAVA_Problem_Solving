public class inter {
    public static void main(String[] args){

        int[] arr = new int[]{23,2,1,6,9,7};
        int k=6;
        int multiple_of_six=1;
        for(int i=0;i<arr.length;i++){
          if((arr[i]+arr[i+1])%k==0){
              System.out.println(true);
          }
            }
        }

    }

//     multiple_of_six=k*(i+1);
////            System.out.println("Multiple of six is "+multiple_of_six);
//             for(int j=i+1;j<arr.length;j++){
//        System.out.println("values of i and j "+arr[i]+" "+arr[j]);
//        if((arr[i]+arr[j]) % k==0){
//        System.out.println(true);
//        break;
//        }

