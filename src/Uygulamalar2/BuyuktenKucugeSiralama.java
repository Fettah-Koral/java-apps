package Uygulamalar2;
import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int n1,n2,n3;

        System.out.print("1. sayiyi giriniz :");
        n1 = n.nextInt();
        System.out.print("2. sayiyi giriniz :");
        n2 = n.nextInt();
        System.out.print("3. sayiyi giriniz :");
        n3 = n.nextInt();

        if ((n1>=n2)&&(n1>=n3)){
            System.out.println(n1 +" > ");
            if (n2>n3) System.out.print(n2 +" > "+n3);
            else System.out.print(n3 +" > "+n2);
        }
        else if ((n2>=n1)&&(n2>=n3)){
            System.out.println(n2 +" > ");
            if (n1>n3) System.out.print(n1 +" > "+n3);
            else System.out.print(n3 +" > "+n1);
        }
        else {
            System.out.println(n3 +" > ");
            if (n2>n1) System.out.print(n2 +" > "+n1);
            else System.out.print(n1+" > "+n2);
        }


    }
}
