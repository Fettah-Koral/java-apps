import java.util.Arrays;
import java.util.Scanner;

public class WhileDongusu {
    public static void main(String[] args) {

        /*  int i =1,k=1;
        while (i<=2){
            System.out.println(i+". dongu");
            k = 1;
            while (k<4){
                System.out.println("k suan : "+k);
                k++;
            }
            System.out.println("-------------------");
            i++;
        }
        */

        /*
        int left =100,right =200;
//      bu iki sayinin orta nokasi bulunacak
        while(++left<--right);
        System.out.println(left+"___"+right);
        */

        int password ;
        int correctPasword =123;
        Scanner input =new Scanner(System.in);

        System.out.printf("Enter your password : ");
        password = input.nextInt();

        while (password!=correctPasword){
            System.out.println("your password is wrong please try again .\n------------------------------");
            System.out.printf("Enter your password : ");
            password = input.nextInt();
        }
        System.out.println("you have successfully logged in");

    }
}
