package Uygulamalar3;

import java.util.Scanner;


public class Kombinasyon {

    static int factorial(int number){
        int result=1;
        for(int i =1;i<=number;i++){
            result*=i;
        }return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n ,r;

        System.out.print("enter combination's 1.element : ");
        n=input.nextInt();
        System.out.print("enter combination's 2.element : ");
        r=input.nextInt();


        int combination=factorial(n)/(factorial(r)*factorial((n-r)));
        System.out.println(combination);
    }
}
