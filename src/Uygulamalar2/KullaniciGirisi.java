package Uygulamalar2;
import java.util.Scanner;


public class KullaniciGirisi {
    public static void main(String[] args) {
        boolean cikis =false;
        int denemeS=0;
       while (!cikis){
           String userName,password,sifirlama,newPassword,sonlandir;
           Scanner inp = new Scanner(System.in);

           System.out.print("kullanici adinizi giriniz :");
           userName = inp.nextLine();
           System.out.print("sifrenizi giriniz :");
           password = inp.nextLine();


           if(userName.equals("kodluyoruz")&&password.equals("1234")&&denemeS<=3){
               System.out.println("başarıyla giris yaptınız");
           }
           else if (denemeS>3){
               System.out.println("sifenizi sıfırlamak istiyormusunuz? (E , H )");
               sifirlama=inp.nextLine();
               switch (sifirlama){
                   case ("E"):
                       System.out.print("Yeni sifreyi giriniz : ");
                       boolean farklimi= false;
                       while (!farklimi){
                           newPassword=inp.nextLine();
                           if (!newPassword.equals("1234")) {
                               farklimi=true ;
                               System.out.println("Sifre oluşturuldu");
                               password = newPassword;
                               break;
                           }
                           else System.out.println("Sifre olusturulamadı, lutfen baska sifre giriniz.");
                       }
                       break;
               }
           }
           else System.out.println("hatalı giris tekrar deneyiniz");
           denemeS++;
           System.out.println("uygulamadan cikmak istiyormusunuz ? (E,H) ");
           sonlandir = inp.nextLine();
           if (sonlandir.equals("E")||sonlandir.equals("e")) cikis=true;
       }
       }
}
