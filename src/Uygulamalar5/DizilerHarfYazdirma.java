package Uygulamalar5;

public class DizilerHarfYazdirma {
    public static void main(String[] args) {

    //     String [][] array = new String [6][4];
    //     for(int i =0 ;i<array.length;i++ ){
    //         for(int j =0;j<array[0].length;j++){
    //             if(i==0||i==2) array[i][j]=" * ";
    //             else if(j==0||j==3) array[i][j]=" * ";
    //             else array[i][j]="   ";
    //         }
    //     }
    //    for (int index = 0; index < array.length; index++) {
    //     for(String s:array[index]){
    //         System.out.print(s);
    //     }System.out.println();
    //    }

            String letter[][] =new String[7][4];
            
            for (int i =0; i<letter.length;i++){
                for (int m=0; m<letter[0].length;m++){
                    if(i==0||i==3||i==6) letter[i][m]=" * ";
                    else if(m==0||m==3) letter[i][m]=" * ";
                    else letter[i][m]="   ";
                }
            }
            for(String [] row :letter){
                for(String column:row){
                    System.out.print(column);
                }System.out.println();
            }

    }
    
}
