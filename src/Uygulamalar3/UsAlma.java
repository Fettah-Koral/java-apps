package Uygulamalar3;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,pow,total=1;

        System.out.print("enter a number : ");
        num=inp.nextInt();

        System.out.print("enter the pow : ");
        pow=inp.nextInt();

        for (int i=1;i<=pow;i++){
            total*=num;
        }
        System.out.println(total);
    }
}
