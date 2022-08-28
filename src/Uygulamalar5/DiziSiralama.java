package Uygulamalar5;

import java.util.Scanner;
import java.util.Arrays;

public class DiziSiralama {
    public static void main(String[] args) {

        Scanner dim = new Scanner(System.in);
        System.out.print("Dizinin boyutu : ");

        int dimesion=dim.nextInt();
        int [] array= new int [dimesion];
        int element;

        for (int i=0;i<dimesion;i++){

            System.out.print(i+1+". elemani giriniz : ");
            element=dim.nextInt();
            array[i]=element;
        }Arrays.sort(array);
        System.out.println("Siralama : "+Arrays.toString(array));
    }
}
