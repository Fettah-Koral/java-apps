public class Metotlar2 {

    static int sum (int num1 , int num2){
        return num1+num2;
    }

//    void metotlar bir değişkene atanamaz çünkü geriye bir değer döndürmezler.
    static void topla(int a , int b){

        System.out.println(a+b);
        return; // sadece return yzasrsan hata vermez reurna bir değer atarsan hata verir !
    }

    public static void main(String[] args) {
        topla(55,45);
        System.out.println(sum(89,465));
    }
}
