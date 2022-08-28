package Uygulamalar;
import java.util.Scanner;

public class DaireninAlaniVeCevresi {
    public static void main(String[] args) {

        double alan,cevre;
        float pi = 3.14f;
        int r ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Dairenin yaricapini giriniz : ");
        r = inp.nextInt();

        alan = (pi*r*r);
        cevre = (2*pi*r);
        System.out.println("Dairenin alani : "+alan);
        System.out.println("Dairenin cevresi : "+cevre);

    }
}
