package Uygulamalar2;
import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;
        Scanner inp = new Scanner(System.in);
        System.out.print("Yil giriniz : ");
        yil = inp.nextInt();

        if ((yil%4==0)){
            if (yil%100==0){
                if ((yil%400==0))System.out.println(yil+" yili artik yildir.");
                else System.out.println(yil+" yili artik yil degildir.");
            }
            else System.out.println(yil+" yili artik yildir.");
        }

        else System.out.println(yil+" yili artik yil degildir.");

    }
}
