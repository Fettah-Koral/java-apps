package Uygulamalar6;

import java.util.Scanner;

public class PalindormKelime {

    static boolean isPalindorme(String word) {

        boolean isPalindorme = false;
        char[] reverse = new char[word.length()];

        for (int k = word.length()-1; k >= 0; k--) {
            reverse[word.length()-1 - k] = word.charAt(k);
        }
        String reWord = new String(reverse);
        isPalindorme = (reWord.equals(word)) ? true : false;
        return isPalindorme;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("kelime giriniz : ");
        String word = input.nextLine();

        if (isPalindorme(word)) System.out.println(word + " kelimesi palindormdur.");
        else System.out.println(word + " kelimesi palindorm degildir.");
    }
}
