package Uygulamalar2;
import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {

        double sayi1, sayi2,sonuc=0 ;
        int islem;
        Scanner girdi = new Scanner(System.in);
        System.out.println("yapılacak işlemi seçin :\n1- toplama\n2- cikarma\n3- carpma\n4- bolme");
        islem = girdi.nextInt();

        System.out.print("1.sayiyi girin : ");
        sayi1 = girdi.nextDouble();

        System.out.print("2.sayiyi girin : ");
        sayi2 = girdi.nextDouble();

        switch (islem){
            case 1 :
                sonuc=sayi1+sayi2;
                break;

            case 2 :
                sonuc =sayi1-sayi2;
                break;

            case 3 :
                sonuc =sayi1*sayi2;
                break;
            case 4 :
                if (sayi2!=0)sonuc =sayi1/sayi2;
                else System.out.println("hicbir sayi sifira bolunemez!");
                break;
            default:
                System.out.println("hatali giris yaptiniz!");
                break;
        }System.out.println(sonuc);


    }
}
