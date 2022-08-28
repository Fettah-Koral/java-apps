package Uygulamalar5;

import java.util.Scanner;
import java.util.Arrays;

/**
 * MinMax
 */
public class MinMax {

  public static void main(String[] args) {
    /*

    int []list ={56,34,1,8,101,-2,-33};
    int min = list[0];
    int max = list[0];

    for (int i : list) {
        max = max<i ? i:max;
        min = min>i ? i:min;
    }System.out.println("max  : "+max);
    System.out.println("min  : "+min);
    
    */
    Scanner inp = new Scanner(System.in);
    int []dizi = {15,12,788,1,-1,-778,2,0};
    Arrays.sort(dizi);
    System.out.println("sayi girin : ");
    int sayi = inp.nextInt();
    int min=0;
    for(int j :dizi){
        
        if (j<sayi){
            min=j;
        }
        else if (j>sayi) 
        {System.out.println("en yakin max = "+j);
        System.out.println("en yakin min = "+min);
        break;}
        
    }
  }
    
}