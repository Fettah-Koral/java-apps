package Uygulamalar3;

import java.util.Scanner;
import java.util.*;

public class MinMaxBulma {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("kac tane sayi gireceksiniz ? : ");
        int sayi;
      

        sayi = inp.nextInt();
        int[] dizi = new int[sayi];
        for (int i = 0; i < sayi; i++) {
            
            System.out.print((i+1)+". sayiyi giriniz : ");
            dizi[i]=inp.nextInt();
          
        }
        Arrays.sort(dizi);
        for (int i : dizi) {
            System.out.print(i+" < ");
        }
        // değişiklik yapıldı.

    }
    
}
