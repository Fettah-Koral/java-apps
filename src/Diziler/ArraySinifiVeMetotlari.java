package Diziler;

import java.util.Arrays;

public class ArraySinifiVeMetotlari {

    static  boolean esitmi(int[]arr1,int []arr2){
        boolean result=true;
        if (arr1.length!=arr2.length) return false;
        for (int i=0, j = 0; i < arr1.length&&j<arr2.length;i++,j++){
            if (arr1[i]!=arr2[j]){
                result = false;
                return  result;
            }
        }
        return result;
    }

//     başka bir sınıfın metotarına nesne üretmeden ulaşmak için diğer sınıftan
//     ulaşılmak istenen metotun başına static yazılır   ör: className.methodName şek. nesne üretmeden çağrılabilir

    public static void main(String[] args) {
        double[] list1 = {1.2, 2, 3.5, 6.8, -45.6, 9.2, 11.4, 23.4, -4.5, -36};

//        Arrays.toString() dizinin elemanlarını ekrana yazdırır.
        System.out.println(Arrays.toString(list1));

//        Arrays.fill() dizinin elemanlarını verilen değerle değiştirir\doldurur.
        Arrays.fill(list1, 5);
        System.out.println(Arrays.toString(list1));
        Arrays.fill(list1, 2, 8, 88);
        System.out.println(Arrays.toString(list1));

        double[] list2 = {1.2, 2, 3.5, 6.8, -45.6, 9.2, 11.4, 23.4, -4.5, -36};
//        Arrays.sort() dizinin elemalarını küçükten büyüğe doğru sıralar
        Arrays.sort(list2);
        System.out.println("===============================\n\n" + Arrays.toString(list2));

//        Arrays.binarysearch() dizinin bir elemanının indexini bulmak için kullanılır.
//        (küçükten büyüğe doğru sıralanmış dizilerde kullanılır)
        System.out.println(Arrays.binarySearch(list2, 23.4));

//      Arrays.copyOf() bir diziyi kopyalamak için kulanılır.
//      Arrays.copyOfRange() bir dizininin içindeki belli bir aralığı kopyalar.
        double[] copyList = Arrays.copyOf(list2, 5);
        System.out.println("===============================\n\n" + Arrays.toString(copyList));

        double[] copyRange = Arrays.copyOfRange(list2, 5, list2.length);
        System.out.println("===============================\n\n" + Arrays.toString(copyList));
        System.out.println(Arrays.toString(copyRange));


        System.out.println("===============================\n");
//        Arrays.equals() iki dizinin eşit olup olmadığını kontrol eder.
        int[] l1 = {1, 2, 3};
        int[] l2 = {1, 2, 3};
        int[] l3 = {5, 3, 6};
        int[] l4 = {3, 2, 1};
        System.out.println(Arrays.equals(l1,l2));
        System.out.println(Arrays.equals(l1,l4));
        System.out.println(Arrays.equals(l2,l3));
        System.out.println("__________________________");
        System.out.println(esitmi(l1,l2));
        System.out.println(esitmi(l1,l4));
        System.out.println(esitmi(l2,l3));
    }
}
