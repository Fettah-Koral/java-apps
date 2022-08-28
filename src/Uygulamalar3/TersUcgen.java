package Uygulamalar3;

/**@author:muhammet fettah koral
 * TersUcgen
 */
import java.util.*;

public class TersUcgen {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter pattern size : ");

        int number = inp.nextInt();
        System.out.println("\n");

       for (int i = 0; (number-i)!=0; i++) {
        int j=i;
        int m=number-i;    
        while(j>0){
                System.out.print(" ");
                j--;
            }
        while(m!=0){
            if (m==1){System.out.println("*");break;}
            System.out.print("**");
            m--;
        } System.out.println();
        // ------------

       }
    }
}