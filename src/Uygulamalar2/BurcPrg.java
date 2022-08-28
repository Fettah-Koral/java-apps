package Uygulamalar2;
import java.util.Scanner;

public class BurcPrg {
public static void main(String[] args) {

    Scanner girdi = new Scanner(System.in);
    int ay,gun;
    
    System.out.print("ay numarasini giriniz : ");
    ay= girdi.nextInt();
    
    System.out.print("gunu giriniz : ");
    gun = girdi.nextInt();
    
    String burc="";
    boolean dogruIslem=true;

    if(gun<=31){
        switch(ay){
        
            case 1 :
            if (gun>=22) burc = "Kova";
            else burc="Oglak";
            break;
    
            case 2 :
            if (gun>=20) burc = "Balık";
            else burc="Kova";
            break;
    
            case 3 :
            if(gun>=21) burc="Koc";
            else burc="Balik";
            break;
    
            case 4 :
            if (gun>=21) burc ="Boga";
            else burc= "Koc";
            break;
    
            case 5: 
            if(gun>=22) burc ="Ikizler";
            else burc="Boga";
            break;
    
            case 6 :
            if (gun>=23) burc="Yengec";
            else burc="Ikizler";
            break;
    
            case 7 :
            if (gun>=23) burc="Aslan";
            else burc="Yengec";
            break;
    
            case 8 :
            if (gun>=23) burc="Basak";
            else burc="Aslan";
    
            case 9 :
            if (gun>=23) burc="Terazi";
            else burc="Basak";
            break;
    
            case 10:
            if (gun>=23) burc="Akrep";
            else burc="Terazi";
            break;
    
            case 11 :
            if (gun>=22) burc = "Yay";
            else burc="Akrep";  
            break;
    
            case 12 :
            if (gun>=22) burc = "Oglak";
            else burc="Yay";
            break;
            
            default:
            System.out.println("Hatali islem yapildi ! ");
            dogruIslem=false;
            break;
    
        } 
    } else System.out.println("Hatali islem !");
    
    if(!dogruIslem)System.out.println("burcunuz : "+ burc);
    
    

}
}
