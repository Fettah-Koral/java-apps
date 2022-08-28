package Uygulamalar3;
import java.util.Scanner;

public class YildizlarIleUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dimesion = input.nextInt();

        for (int i =1;i<dimesion+1;i++){

            int counter1=i;
            while (counter1>0) {
                System.out.print("*"); counter1--;
            }

            if(i==dimesion){
                System.out.println();
                for  (int j =dimesion;j>0;j--){
                    int counter2=j;
                    do {
                        System.out.print("*");
                        counter2--;

                    }while (counter2>0);
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
