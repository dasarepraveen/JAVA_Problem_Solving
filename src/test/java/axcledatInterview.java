public class axcledatInterview {
    public static void main(String[] args) {
        int[] input = new int[]{4, -1, 2, 1};

        for(int i=0;i<input.length;i++){
            for(int j=i;j<input.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(+input[k]+" ");
                }
                System.out.println("");
            }
        }


        }
}
