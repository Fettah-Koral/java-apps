package Uygulamalar;

import java.util.Scanner;

public class HipotenusHesabi {
    public static void main(String[] args) {
        double dikK1,dikK2,hipotenus;
        Scanner input = new Scanner(System.in);
        System.out.print("1.Dik kenari giriniz : ");

        dikK1 = input.nextDouble();
        System.out.print("2.Dik kenari giriniz : ");

        dikK2 = input.nextDouble();
        double totSquare = Math.pow(dikK1,2)+Math.pow(dikK2,2.0);

        hipotenus=Math.sqrt(totSquare);
        System.out.println("Hipotenus : "+hipotenus);
    }

}
