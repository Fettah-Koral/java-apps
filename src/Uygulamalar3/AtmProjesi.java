package Uygulamalar3;

import java.util.Scanner;


public class AtmProjesi {
    public static void main(String[] args) {

        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500, select;
        boolean enter = false;

        while (right > 0 && enter == false) {

            System.out.print("kullanici adi : ");
            userName = inp.nextLine();
            System.out.print("sifre : ");
            password = inp.nextLine();
            boolean userNameCorrect = false;
            boolean passwordCorrect = false;


            switch (userName) {
                case "patika":
                    userNameCorrect = true;
                    switch (password) {
                        case "dev123":
                            passwordCorrect = true;
                            break;
                        default:
                    }
                    break;
                default:


            }
            int correctUser = (userNameCorrect && passwordCorrect) ? 1 : 0;

            switch (correctUser) {
                case 1:
                    System.out.println("Merhava Kodluyoruz banksina hos geldiniz ....");
                    enter=true;

                    do {
                        System.out.println("1-para yatirma  \n2-para cekme\n" + "3-bakiye sorgulama\n4-cikis yap");
                        System.out.println("Lutfen yapacaginiz islemi seciniz : ");
                        select = inp.nextInt();
                        switch (select) {
                            case 1:
                                System.out.println(" ne kadar para yatiracaksiniz : ");
                                int price = inp.nextInt();
                                price = price > 0 ? price : 0;
                                balance += price;
                                System.out.println("hesabinizdaki bakiye :\t" + balance + " tl ");
                                break;

                            case 2:
                                System.out.println("ne kadar para cekeceksiniz : ");
                                int price2 = inp.nextInt();
                                price2 = ((balance-price2) >= 0) & price2>0 ? price2 : 0;
                                balance -= price2;
                                System.out.println("hesabinizdaki bakiye :\t" + balance + " tl ");
                                break;

                            case 3:
                                System.out.println("hesabinizdaki bakiye :\t" + balance + " tl ");
                                break;
                            default:

                        }
                    } while (select != 4);

                    break;

                default:
                    right--;

                    switch (right) {
                        case 0:
                            System.out.println("cok sayida hatali giris yaptiniz hesabiniz bloke oldu Lutfen bankayla iletisime gecin.");
                            break;

                        default:
                            System.out.println("hatali giris yaptiniz ..");
                            System.out.println("kalan deneme hakkiniz : " + right);
                            break;

                    }
                    break;


            }

        }


    }
}
