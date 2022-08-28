package Uygulamalar2;
import java.util.Scanner;

public class HavaSicakligiGoreEtkinlik {
    public static void main(String[] args) {
        int sicaklik;
        System.out.print("hava sicakligini girin : ");
        Scanner inp = new Scanner(System.in);
        sicaklik = inp.nextInt();
        if (sicaklik<5) System.out.println("Kayak yapilabilir.");
        if (sicaklik>=5 && sicaklik<15) System.out.println("Sinamaya gidilebilir.");
        if (sicaklik>=10 && sicaklik<25) System.out.println("piknige gidilebilir.");
        if (sicaklik>=25) System.out.println("yuzmeye gidilebilir.");

    }
}
