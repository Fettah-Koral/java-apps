package Uygulamalar4;
import java.util.Scanner;

public class RecursiveUsluSayi {

    static int calculeteThePow (int number,int power){
        if (power == 0) return 1;
        return calculeteThePow(number,power-1)*number;
    }
    public static void main(String[] args) {

        System.out.println(calculeteThePow(2,5));


    }
}
