import java.util.Scanner;

public class ForVsWhile {
    public static void main(String[] args) {
    /*
        int number;
        Scanner input = new Scanner(System.in);


        for (boolean run = true ;run;){
            System.out.print("enter a number : ");
            number = input.nextInt();
            if (number<0){
                run = false;
            }
        }

        int sayi;
        Scanner girdi = new Scanner(System.in);

        do {
            System.out.print("bir sayi giriniz : ");
            sayi = girdi.nextInt();
        }while (sayi>=0);

    */
        for (int i = 0; i <= 10; i++) {
            System.out.print(i+",");
        }

        System.out.println("\n------------------------");

        int i =0;
        while (i<=10){
            System.out.print(i+",");
            i++;
        }
    }
}

