package Uygulamalar4;
import java.util.Scanner;

public class DeseneGoreMetot {

    static  void Recursive(int x,int count){
        System.out.print(x+" ");

        if (x>0) {
            count++;
            Recursive(x-5,count);
        }
        else {
            while (count>0) {
                System.out.print((x+5)+" ");
                x+=5;
                count--;
            }return;
        }


    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("sayi giriniz : ");
        int n;

        n =inp.nextInt();
        System.out.println();

        Recursive(n,0);

    }
}
