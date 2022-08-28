package Uygulamalar;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double mesafe ,ucret,KM_UCRETI=2.20;
        int ACILIS_UCRETI = 10;

        System.out.print("kac km mesafe kat edilecek ?  : ");
        mesafe = inp.nextDouble();

        ucret = (mesafe * KM_UCRETI)+ACILIS_UCRETI;
        ucret = ucret<=20 ? 20:ucret;
        System.out.println("odenecek tutar : "+ucret);

    }
}
