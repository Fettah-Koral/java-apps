package Uygulamalar;
import java.util.Scanner;

public class ManavKasaProg {
    public static void main(String[] args) {

        double kArmut=2.14,kElma=3.67,kDomates=1.11,kMuz=0.95,kPatlican=5,fiyat=0;
        Scanner k1=new Scanner(System.in);


        System.out.print("Armut kac kilo ? : ");
        fiyat+= (k1.nextDouble()*kArmut);

        System.out.print("Elma kac kilo ? : ");
        fiyat+= (k1.nextDouble()*kElma);

        System.out.print("Domates kac kilo ? : ");
        fiyat+= (k1.nextDouble()*kDomates);

        System.out.print("Muz kac kilo ? : ");
        fiyat+= (k1.nextDouble()*kMuz);

        System.out.print("Patlican kac kilo ? : ");
        fiyat+= (k1.nextDouble()*kPatlican);

        System.out.println("\n===============================\n"+"Toplam fiyat : "+fiyat);

    }
}
