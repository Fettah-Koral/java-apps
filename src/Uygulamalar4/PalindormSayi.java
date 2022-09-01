package Uygulamalar4;

import java.util.Scanner;
/**
 * @author muhammet fettah koral 01.09.2022
 */
public class PalindormSayi{

    static boolean isPalindorm(int number) {
        int orginalNumber=number;
        int digits = numberOfDigits(number);
        double multiplier;
        double reverseNumber=0;

        while(digits>0){
            multiplier=number%10;
            number/=10;
            reverseNumber=multiplier * Math.pow(10, digits-1)+reverseNumber;
            digits--;
        }
        System.out.println("reverse number is : "+ (int) reverseNumber);
        if (reverseNumber==orginalNumber) {
            return true;
        }
        return false;
    }
    static int numberOfDigits(int number) {
        int numberOfDigit = 0;
        while (true) {
            if (number == 0) {
                break;
            } else {
                number = number / 10;
                numberOfDigit++;
            }
        }
        System.out.println("basamak sayısı : " + numberOfDigit);
        return numberOfDigit;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("lütfen bir sayı giriniz : ");
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        if (isPalindorm(number)) {
            System.out.println(number+" sayısı palindormdur.");
        }
        else System.out.println(number+" sayısı palindorm değildir.");


    }



}