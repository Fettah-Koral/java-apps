package Uygulamalar4;

import java.util.Scanner;

public class HesapMakinesi {
    static int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    static int minus(int x, int y) {
        int result = x - y;
        return result;
    }

    static int times(int x, int y) {
        int result = x * y;
        return result;
    }

    static double divided(int x, int y) {
        if (y == 0) {
            System.out.println("sifira bolme hatasi");
            return 0;
        }
        double result = x / (double) y;
        return result;
    }

    static int power(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        return result;
    }

    static int mode(int x, int y) {
        int result = x % y;

        return result;
    }

    static int factorial(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }

    static void calc(int x, int y) {
        int area = x * y;
        int perimeter = 2 * (x + y);
        System.out.println("alan : " + area);
        System.out.println("cevre : " + perimeter);

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap\n:";
        while (true) {
            System.out.print(menu);
            select = scan.nextInt();
            int x = 0, y = 0;
            if (select == 0) break;
            else if (select < 5 | select > 6) {
                System.out.print("1. sayiyi giriniz : ");
                x = scan.nextInt();
                System.out.print("2. sayiyi giriniz : ");
                y = scan.nextInt();
            } else if (select == 5) {
                System.out.print("sayi giriniz : ");
                x = scan.nextInt();
                System.out.print("us giriniz : ");
                y = scan.nextInt();
            } else if (select == 6) {
                System.out.print("sayi giriniz : ");
                x = scan.nextInt();
            }
            switch (select) {
                case 1:
                    System.out.println(sum(x, y));
                    break;

                case 2:
                    System.out.println(minus(x, y));
                    break;

                case 3:
                    System.out.println(times(x, y));
                    break;

                case 4:
                    System.out.println(divided(x, y));
                    break;

                case 5:
                    System.out.println(power(x, y));
                    break;

                case 6:
                    System.out.println(factorial(x));
                    break;

                case 7:
                    System.out.println(mode(x, y));
                    break;

                case 8:
                    calc(x, y);
                    break;

                default:
                    System.out.println("hatali giris yaptiniz.\n");

            }


        }


    }
}
