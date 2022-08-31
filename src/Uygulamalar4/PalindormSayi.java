package Uygulamalar4;

import java.util.Scanner;
import java.lang.Math;


public class PalindormSayi {
    static void isPalindorme(int number) {
        boolean isPalindorme = false;
        int a = number / 100;
        int b = ((number % 100) - number % 10 ) / 10;
        int c = number % 10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int reverseNumber = 100 * c + 10 * b + 1 * a;
        System.out.println("reverse : "+reverseNumber);
        if (reverseNumber == number) isPalindorme = true;
        if (isPalindorme) System.out.println(number + " sayisi palindormdur.");
        else System.out.println(number + " sayisi palindorm degildir.");

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int number = inp.nextInt();
        isPalindorme(number);

        // 505 1, 4, 8, 99, 101, 363, 4004, 9889..

    }
}