package Uygulamalar5;

public class DiziOrtalmasi {
    
    
    public static void main(String[] args) 
    {
        double [] dizi = {1,2,3,4,5};
        double sum=0;
        for(int i = 0 ;i<dizi.length;i++){
            sum += 1/dizi[i];
        }
        System.out.println("harmonik ortalama : "+sum);
    
    }
  
    
}
