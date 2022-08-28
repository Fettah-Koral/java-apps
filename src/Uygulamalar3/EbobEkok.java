package Uygulamalar3;

import java.util.Scanner;
import java.lang.Math;

public class EbobEkok {
    public static void main(String[] args) {

        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first number : ");
        num1 = input.nextInt();

        System.out.print("enter the second number : ");
        num2 = input.nextInt();

        boolean finish = false;
        int counter=1;
        boolean ekok= false;
        int ebob=1;
        while(!finish){

            if((counter%num1==0)&&(counter%num2==0)&(ekok==false)){
                System.out.println("ekok : "+counter);ekok=true;
            }

            if (ekok) finish=true;
            counter++;
        }
        int counter2=0;
        do {
            counter2++;
            if ((num1%counter2==0)&&(num2%counter2==0))ebob=counter2;

        }
        while (Math.min(num1,num2)>counter2);
        System.out.println("ebob : "+ebob);



    }
}
