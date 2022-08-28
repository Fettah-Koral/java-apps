package Uygulamalar3;

import java.util.Scanner;

public class IkininKuvvetleri {
    public static void main(String[] args) {
        int n,total=1 ;
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number : ");
        n=input.nextInt();
        do {
            System.out.println(total);
            total*=2;
        }
        while (total<=n);

    }
}
