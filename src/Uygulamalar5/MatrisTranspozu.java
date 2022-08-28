package Uygulamalar5;
import java.util.Arrays;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class MatrisTranspozu {
    public static void main(String[] args) {

        Scanner m =new Scanner(System.in);
        int [][] orjinalMatris = new int [2][3];
        int transpozMatris[][]= new int[3][2];
        System.out.println("matrisi giriniz : ");

        for (int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(" ");
                int eleman=m.nextInt();
                transpozMatris[j][i]=eleman;
                orjinalMatris[i][j]=eleman;
            }
        }
        System.out.println("matris : \n");
        for (int[] arr:orjinalMatris){
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("\n--------------------------------------");

        System.out.println("matrisin transpozu : \n");
        for (int[] arr:transpozMatris){
            System.out.println(Arrays.toString(arr));
        }





        // for(int[] row:matris){
        //     for(int col :row){
        //         System.out.println(col);
        //     }
        // }
    }
    
}
