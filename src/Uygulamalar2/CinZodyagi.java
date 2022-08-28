package Uygulamalar2;
import java.util.Scanner;

public class CinZodyagi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        int dogumYili,kalan;
        String hayvan;

        System.out.print("Dogum Yilinizi Giriniz : ");
        dogumYili = inp.nextInt();

        kalan = dogumYili % 12;

        switch (kalan){

            case 0:
                hayvan="Maymun";
                break;

            case 1 :
                hayvan="Horoz";
                break;

            case 2 :
                hayvan="Kopek";
                break;

            case 3 :
                hayvan="Domuz";
                break;

            case 4 :
                hayvan="Fare";
                break;

            case 5 :
                hayvan="Öküz";
                break;

            case 6 :
                hayvan="Kaplan";
                break;

            case 7 :
                hayvan="Tavşan";
                break;

            case 8 :
                hayvan="Ejderha";
                break;

            case 9 :
                hayvan="Yilan";
                break;

            case 10 :
                hayvan="At";
                break;

            default:
                hayvan ="Koyun";
                break;
        }
        System.out.println("Cin zodyaginiz : "+hayvan);

    }
}
