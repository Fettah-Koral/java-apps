package Uygulamalar;
import java.util.Scanner;


public class NotOrtalamasiHesabi {
    public static void main(String[] args) {
        double matematikN,fizikN,kimyaN,turkceN,tarihN,muzikN;
        Scanner ogrenciN =new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz : ");
        matematikN = ogrenciN.nextDouble();
        System.out.println("Fizik notunuzu giriniz : ");
        fizikN = ogrenciN.nextDouble();
        System.out.println("Kimya notunuzu giriniz : ");
        kimyaN = ogrenciN.nextDouble();
        System.out.println("Turkce notunuzu giriniz : ");
        turkceN = ogrenciN.nextDouble();
        System.out.println("Tarih notunuzu giriniz : ");
        tarihN = ogrenciN.nextDouble();
        System.out.println("Muzik notunuzu giriniz : ");
        muzikN = ogrenciN.nextDouble();

        double ortalama = (matematikN+fizikN+kimyaN+turkceN+tarihN+muzikN)/6;
        System.out.print("\nOrtalamaniz : "+ortalama);
        String sonuc = ortalama>=60 ? "Gecti":"Kaldi";
        System.out.print("\n"+sonuc);
    }

}
