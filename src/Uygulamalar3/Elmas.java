/**
* @author : muhammet fettah koral , 2022-08-23 ,16:25
*/


package Uygulamalar3;

import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {

        int dimesion, space, counter1, counter2;
        Scanner inp = new Scanner(System.in);
        dimesion = inp.nextInt();

        for (int i = 0; i < dimesion; i++) {
            int dim = i * 2 + 1;
            counter1 = dimesion - i;
            do {
                System.out.print(" ");
                counter1--;
            } while (counter1 > 0);

            while (dim > 0) {
                System.out.print("*");
                dim--;
            }
            System.out.println();
        }


        for (int j = dimesion-1; j > 0; j--) {
            counter2 = dimesion-j;
            while (counter2 >= 0) {
                System.out.print(" ");
                counter2--;
            }

            int dim = j * 2 - 1;
            while (dim > 0) {
                System.out.print("*");
                dim--;
            }
            System.out.println();
        }


    }
}
