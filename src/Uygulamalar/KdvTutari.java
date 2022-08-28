package Uygulamalar;
import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        double fiyat,kdv,toplamTutar,kdvOran=0.18;

        Scanner input = new Scanner(System.in);
        System.out.print(" Urunun fiyatini giriniz : ");

        fiyat = input.nextDouble();
        kdv = (fiyat*kdvOran);
        System.out.println("KDV tutarı : "+kdv);

        toplamTutar = fiyat+kdv;
        System.out.println("Toplam tutar : "+toplamTutar);
    }
}
