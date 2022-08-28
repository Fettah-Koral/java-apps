package Uygulamalar2;
import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mesafe , yas ,yolculukT=0;
        double yasliInd=0.3,cocukInd=0.5,gencInd=0.1,yolculukTipiInd=0.2,fiyat;

        System.out.print("yolculuk mesafesini girin : ");
        mesafe = inp.nextInt();

        System.out.print("yolcunun yasini girin : ");
        yas = inp.nextInt();

        System.out.print("yolculuk tipini secin : ( 1: tek yon / 2 : gidis-donus )");
        yolculukT = inp.nextInt();

        if (mesafe<0) mesafe=0;
        fiyat = mesafe*0.10;


        if (yas<12 && yas>=0)  fiyat *= (1-cocukInd);

        else if (yas>=12 && yas<25) fiyat *= (1-gencInd);

        else if (yas>=25 && yas<=65);

        else if (yas>65) fiyat *= (1-yasliInd);

        else System.out.println("hatali veri girdiniz!");

        if (yolculukT==2) fiyat *= (1-yolculukTipiInd)*2;
        else if (yolculukT==1)  ;
        else System.out.println("hatali giris yaptiniz !");

        System.out.println("Toplam tutar : "+fiyat);

    }
}
