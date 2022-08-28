package Uygulamalar;
import java.util.Scanner;

public class VKitleIndexi {
    public static void main(String[] args) {
        System.out.println("Lutfen boyunuzu metre cinsinden giriniz : ");
        Scanner inpmetre = new Scanner(System.in);
        Scanner inpkilo = new Scanner(System.in);
        double metre,kilo,vko;
        metre = inpmetre.nextDouble();
        System.out.println("Lutfen kilonuzu giriniz : ");
        kilo = inpkilo.nextDouble();
        vko = kilo/(metre*metre);
        System.out.println("Vucut kitle indexsiniz : "+vko);
    }
}
