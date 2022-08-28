package Uygulamalar3;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n , result=1 ;

        System.out.print("enter factorial : ");
        n=input.nextInt();

        for(int i =1;i<=n;i++){
            result*=i;
        }
        System.out.println(result);
    }
}
