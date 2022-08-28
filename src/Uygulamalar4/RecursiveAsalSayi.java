package Uygulamalar4;
import java.util.Scanner;

public class RecursiveAsalSayi {

    static int birAzalt(int a) {return a-1;}

    static void asalMi(int x){
        boolean asal = true;
        for (int i =x;2<i;i--){
            if (x%birAzalt(i)==0) asal=false;
        }
        if (asal) System.out.println(x+" sayisi bir asal sayidir.");
        else System.out.println(x+" sayisi asal degildir.");
    }

    public static void main(String[] args) {

        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        sayi = inp.nextInt();
        asalMi(sayi);

    }
}
