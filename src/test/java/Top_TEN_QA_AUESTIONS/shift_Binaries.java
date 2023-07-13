package Top_TEN_QA_AUESTIONS;

public class shift_Binaries {
    public static void main(String[] args) {
        int temp;
        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int ass : arr) {
            System.out.println(ass);


        }
    }
}
