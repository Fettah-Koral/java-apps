package Diziler;

public class deneme
{
    public static void main(String[] args) {
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[3];
        int sum = 0;
        for (int i = 0; i < 3; ++i){
        for (int j = 0; j < i + 1; ++j) {
            arr[i][j] = j + 1;
            System.out.printf(arr[i][j]+"\t");
        }


            System.out.println();}
        for (int i = 0; i < 3; ++i)
        for (int j = 0; j < i + 1; ++j)
        sum += arr[i][j];
//        System.out.print(sum);

        CokBoyutluDiziler.printArray(arr);
    }
}
