package Uygulamalar3;
import java.util.*;

public class MukemmelSayi {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("enter a number : ");
        
        int num,total=0;
        num =inp.nextInt();

        for (int i = 1; i < num; i++) {
            if (num%i==0){
                total+=i;
            }
            
        }
        if (total == num)
            System.out.println(" The number " + num + " is a perfect number");
        else System.out.println(" The number isn't a perfect number");
        
    }

}
