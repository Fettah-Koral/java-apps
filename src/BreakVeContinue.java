public class BreakVeContinue {
    public static void main(String[] args) {
//        for (int i=1;i<=10;i++){
//            if ( i == 5){
//                System.out.println("i nin degeri 5 tir.");
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i=1;i<=10;i++){
//            if ( i == 5){
//                System.out.println("i nin degeri 5 tir.");
//                continue;
//            }
//            System.out.println(i);
//        }

//        int j =1 ;
//        while (j<=10){
//            if (j==3){
//                System.out.println("j nin degeri 3 tur.");
//                break;
//            }
//            System.out.println(j);
//            j+=2;
//        }


        int j =1 ;
        while (j<=10){
            if (j==3){
                System.out.println("j nin degeri 3 tur.");
                j+=2;
                continue;
            }
            System.out.println(j);
            j+=2;
        }
    }
}
