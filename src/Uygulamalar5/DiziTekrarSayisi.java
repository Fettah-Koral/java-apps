package Uygulamalar5;

import java.util.Arrays;

public class DiziTekrarSayisi {

    static boolean isFind(int[]array,int x ){
        for(int n:array){
            if(n==x) return true;
        }return false;
    }
    public static void main(String[] args) {

        int []arr={10, 20, 20, 10, 10, 20, 5, 20};
        int [] dupl=new int [arr.length];
        int startIndex=0;

        for(int i=0;i<arr.length;i++){
            int duplicate=1;
            if (isFind(dupl, arr[i])){
                        continue;
                    }
           
            for(int j=0;j<arr.length;j++){

                    if(i!=j && arr[i]==arr[j]){
                        duplicate++;
                        if (isFind(dupl, arr[j])) continue;
                        dupl[startIndex++]=arr[j];
                    } 
                    
            }
                System.out.println(arr[i]+" - Tekrar Sayisi : "+duplicate);
            }
        } 
        
    }
    

