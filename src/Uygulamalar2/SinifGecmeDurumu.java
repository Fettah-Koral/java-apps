package Uygulamalar2;
import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int mat,muz,kimya,fizik,turkce,toplam=0;
        double ortalama;

        System.out.print("matemetik notunu girin ");
        mat =inp.nextInt();

        System.out.print("muzik notunu girin ");
        muz =inp.nextInt();

        System.out.print("turkce notunu girin ");
        turkce =inp.nextInt();

        System.out.print("kimya notunu girin ");
        kimya =inp.nextInt();

        System.out.print("fizik notunu girin ");
        fizik =inp.nextInt();

        int[] dersler = { mat,muz,kimya,fizik,turkce};
        int hesaplanan=0;

        for (int j : dersler){
            if (j<0||j>100){
                continue;
            }
            toplam+=j;
            hesaplanan++;

        }
        ortalama=(toplam/hesaplanan);
        System.out.println("ortalama : "+ortalama);

        if (ortalama<=55) System.out.println("sinifta kaldiniz.");
        else System.out.println("tebrikler sinifi gectiniz");

    }


}
