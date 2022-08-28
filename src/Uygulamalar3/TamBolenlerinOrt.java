package Uygulamalar3;

import  java.util.Scanner;

public class TamBolenlerinOrt {
    public static void main(String[] args) {

        int number,total=0,count=0;
        double avarage ;

        Scanner inp = new Scanner(System.in);
        System.out.println("enter a number : ");

        number = inp.nextInt();

        for(int i = 1 ; i < number;i++){
            if ((i%3==0) && (i%4==0)) {
                System.out.println(i);
                total+=i;
                count++;
            }
        }
        avarage = total/count;
        System.out.println("avarage : "+avarage);
    }
}
