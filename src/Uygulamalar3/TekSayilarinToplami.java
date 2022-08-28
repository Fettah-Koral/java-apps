package Uygulamalar3;
import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {


        int sayi,toplam=0,iterasyon;
        Scanner girdi= new Scanner(System.in);
        System.out.println("kac adet sayi gireceksiniz? : ");
        iterasyon = girdi.nextInt();

        while (iterasyon>0){
            sayi=girdi.nextInt();
            if (sayi%2==1){
                toplam+=sayi;
            }
           iterasyon--;

        }
        System.out.println(toplam);
    }
}
