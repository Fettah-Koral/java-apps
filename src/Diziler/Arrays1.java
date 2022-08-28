package Diziler;

public class Arrays1 {

    static void printArray(int[] arr) {
        System.out.printf("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+",");
        }
        System.out.printf("}");
    }
    static void printArray(double[] arr) {

        System.out.printf("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(arr[i]+",");
        }
        System.out.printf("}");
    }

    static  int[] reverse (int [] arr){
        int [] arr2 = new int[arr.length];

        for (int i=1;i<=arr.length;i++){

            arr2[i-1]=arr[arr.length-i];
        }
        return arr2;

        /*
        * for(int i=0,int j =arr.length; i<arr.length; i++ ,j--)
        * şeklindede yapılabilirdi.
        * */


    }
    static  double[] reverse (double [] arr){
        double [] arr2 = new double[arr.length];

        for (int i=1;i<=arr.length;i++){

            arr2[i-1]=arr[arr.length-i];
        }
        return arr2;
    }

    public static void main(String[] args) {

        int[] list = new int[10];
//        list[0]=10;
//        list[1]=20;
//        list[2]=30;
        for (int i = 0; i < list.length; i++) {
            list[i] = (i * 10) + 10;
//            System.out.println(list[i]);
        }
        int[] list2 = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        double [] list3 = {1.1,2.2,3.3};
//        System.out.println(list2[5]);
    /*    printArray(list);
        System.out.println("\n======================================");
        printArray(list2);
        System.out.println("\n======================================");
        printArray(list3);*/
        printArray(list2);
        System.out.println();
        printArray(reverse(list2));
        System.out.println("\n========================");
        printArray(list3);
        System.out.println();
        printArray(reverse(list3));

    }
}
