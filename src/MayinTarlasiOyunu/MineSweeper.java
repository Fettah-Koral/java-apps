package MayinTarlasiOyunu;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    static void printMatrix(String[][] matrix) {
        for (String[] rw : matrix) {
            for (String col : rw) {
                System.out.print("\t" + col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();
        System.out.println("Mayin tarlasi oyununa hos geldiniz.\n");

        System.out.print("satir sayisi giriniz : ");
        int row = input.nextInt();
        System.out.print("sutun sayisi giriniz : ");
        int column = input.nextInt();

        String[][] matrix = new String[row][column];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = " - ";
            }
        }
        int dim = row * column;
        int numOfMine = (row * column) / 4;
        int temp = numOfMine;
        int[] locOfMine = new int[temp];

        String matrixOfMine[][] = new String[row][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrixOfMine[i][j] = " - ";
            }
        }
        int random;
        while (temp > 0) {

            random = rnd.nextInt(dim);

            if (random > dim) {
                continue;
            }
            locOfMine[temp - 1] = random;
            int tmp = locOfMine[temp - 1];


            int r = tmp== 0 ? 0 : (int) Math.ceil(tmp / (double)column)- 1;
            int c = tmp % (column);

            if (matrixOfMine[r][c].equals(" * ")) {
                continue;
            }
            matrixOfMine[r][c] = " * ";
            temp--;

        }
        System.out.println("Mayinlarin konumu : ");
        printMatrix(matrixOfMine);


        System.out.println("____________________");
        printMatrix(matrix);

        int count = dim - numOfMine;

        while (count > 0) {

            System.out.print("satir giriniz : ");
            row = input.nextInt() - 1;

            System.out.print("sutun giriniz : ");
            column = input.nextInt() - 1;

            if ((row >= matrix.length || row < 0) || (column >= matrix[0].length || column < 0)) {
                System.out.println("satir veya sutun boyutu hatali girildi. ");
                continue;
            }
            if(matrixOfMine[row][column].equals(" * ")){
                System.out.println("Mayina bastiniz oyun bitti.");
                break;
            }
            else {
                int minesNearBy=0;
                // Yatay ve Dikey eksenlerin kontrolü
                if (row<matrix.length-1){
                    if (matrixOfMine[row+1][column].equals(" * ")) minesNearBy++;
                }
                if (row>0){
                    if (matrixOfMine[row-1][column].equals(" * ")) minesNearBy++;
                }
                if (column<matrix[0].length-1){
                    if (matrixOfMine[row][column+1].equals(" * ")) minesNearBy++;
                }
                if (column>0){
                    if (matrixOfMine[row][column-1].equals(" * ")) minesNearBy++;
                }
                // üst çaprazalrın kontrolü

                if((row>0) && (column>0&&column<matrix[0].length-1)){
                    if (matrixOfMine[row-1][column-1].equals(" * ")) minesNearBy++;
                    if (matrixOfMine[row-1][column+1].equals(" * ")) minesNearBy++;
                }
                if((row>0) && (column==0)){
                    if (matrixOfMine[row-1][column+1].equals(" * ")) minesNearBy++;
                }
                if((row>0) && (column==matrix[0].length-1)){
                    if (matrixOfMine[row-1][column-1].equals(" * ")) minesNearBy++;
                }


                // alt çaprazların kontolü
                if((row<matrix.length-1) && (column>0&&column<matrix[0].length-1)){
                    if (matrixOfMine[row+1][column-1].equals(" * ")) minesNearBy++;
                    if (matrixOfMine[row+1][column+1].equals(" * ")) minesNearBy++;
                }
                if((row<matrix.length-1) && (column==0)){
                    if (matrixOfMine[row+1][column+1].equals(" * ")) minesNearBy++;
                }
                if((row<matrix.length-1) && (column==matrix[0].length-1)){
                    if (matrixOfMine[row+1][column-1].equals(" * ")) minesNearBy++;
                }
                matrix[row][column]= String.valueOf(minesNearBy);

            }


            System.out.println("==================");
            printMatrix(matrix);
            count--;
            if (count==0){
                System.out.println("\n Tebrikler oyunu kazandiniz.");
            }
        }

    }
}
