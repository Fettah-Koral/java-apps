package Diziler;


public class CokBoyutluDiziler {

    static void printArray(int[][] arr ){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    static void createMultiDimensionelArray(){
        int arr[][] =new int[5][5];
        int number=1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=number++;
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

//    matirisin satıralrı dizilerden oluşur ,sütünları ise bu dizilerin elemanlarından oluşur
//    dizilerin uzunlukları farklı olabilir yani her satır için sütun sayısı değişkenlik gösterebilir
/*
*       1
*       1   2
*       1   2   3           gibi.
* */
    public static void main(String[] args) {
        int[][] matris = new int[6][6];
        matris[2][3] = 839;
//        System.out.println(matris[2][3]);

        int[][] matris2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

//        System.out.println(matris2[2][3]);

        printArray(matris2);
        System.out.println("=====================\n");
//        printArray(matris);
        createMultiDimensionelArray();
    }
}
