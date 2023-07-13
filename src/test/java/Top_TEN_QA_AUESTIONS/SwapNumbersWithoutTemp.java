package Top_TEN_QA_AUESTIONS;

public class SwapNumbersWithoutTemp {
    public static void main(String[] args){
        int x=3;
        int y=5;
        int z = y+x; //z=8
        x=z-x; //5
        y=z-y;//3

        System.out.println("X is "+x+" Ys is "+y);


    }
}
