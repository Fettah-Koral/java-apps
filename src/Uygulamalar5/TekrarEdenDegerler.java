package Uygulamalar5;

import java.util.Arrays;

public class TekrarEdenDegerler {

    static boolean isFind(int[] x, int y){
    for (int a :x){
        if(a==y) return true;
    }
        return false;
    }
    static void show (int[]array){
        for (int x : array){
            if(x!=0) System.out.println(x);
        }
    }
    public static void main(String[] args) {
        
        int [] arr ={3,7,3,3,2,9,10,21,1,33,9,1};
        int [] duplicate=new int [arr.length];
        int startIndex=0;

        for(int i =0;i<arr.length;i++ ){

            for (int j=0 ; j<arr.length;j++){

                if((i!=j) && (arr[i]==arr[j])) {
                    if(!isFind(duplicate,arr[i])) duplicate[startIndex++]=arr[j];
                    break;
                }
            }
        }
        // System.out.println(Arrays.toString(duplicate));
        show(duplicate);

    }
    
}
