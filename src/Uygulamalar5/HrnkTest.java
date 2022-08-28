package Uygulamalar5;
import java.util.Arrays;
import java.util.*;

public class HrnkTest {
    
        public static void main(String[] args) {
            
            Scanner a =new Scanner(System.in);
            
            int dim=a.nextInt();
            int[]arr=new int[dim]; 
            
            for (int n=0;n<dim;n++){
                arr[n]=a.nextInt();
            }

        int line=0;
        for (int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if (i>j)continue;
                int []arr2=Arrays.copyOfRange(arr, i, j+1);
                int sum=0;
                for (int k : arr2) {
                    sum+=k;                
                }
                if (sum<0) line++;
            }
            for(int m:arr){
                if(i<0)line++;
            }
        }  System.out.println(line);
        
    }
    
}
// 1 -2 4 -5 1