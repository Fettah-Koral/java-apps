package Uygulamalar6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        // Random rand = new Random();
        // int number = rand.nextInt(100);
        Scanner inp = new Scanner(System.in);

        int number = (int) (Math.random() * 100); // tip dönüşümü
        int right = 0;
        int select;
        int[] wrongs = new int[5];
        boolean isWrong = false;
        boolean isWin = false;

        while (right < 5) {
            System.out.println(number);
            select = inp.nextInt();
            if (select == number) {
                System.out.println("Tebrikler dogru tahmin ettiniz, gizli sayi : " + number + "' di.");
                isWin = true;
                break;
            } else {

                if (select < 0 | select > 99) {
                    System.out.println("hatali giris yaptiniz . Lutfen 0-100 arasinda bir deger giriniz");
                    if (isWrong) {
                        System.out.println("birden fazla hatali giris yaptiniz kalan hakkiniz : " + (5 - ++right));
                    }
                    isWrong = true;
                    continue;
                } else if (select > number) System.out.println(select + " sayisi ,gizli sayidan buyuktur.");
                else System.out.println(select + " sayisi ,gizli sayidan kucuktur.");
                wrongs[right++] = select;
                System.out.println("kalan hakkiniz : " + (5 - right));

            }

        }
        if (!isWin && !isWrong) {
            System.out.println("Oyun bitti kaybettiniz.\ngizli sayi : " + number);
            System.out.println("yaptiginiz tahminler : " + Arrays.toString(wrongs));
        } else if (isWin) {
            System.out.println("Tebrikler kazandiniz ...  :) ");
        }
        else  System.out.println("Oyun bitti kaybettiniz.\ngizli sayi : " + number);

    }
}
