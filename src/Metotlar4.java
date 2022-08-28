public class Metotlar4 {

    static  void sum (){
        int a;
        a=12;
        System.out.println("sum a : "+a);
    }

    public static void main(String[] args) {
        int a =20;
        if (a<30){
            int b =12;        }
        // lokal değişkenler tanımlanıdıkları kod blokları veya metotlara aittir farklı metot veya
        // kod bloğunda aynı değişken ismi kullanıla bilir bunlar birbirini etkilemez
//        System.out.println(b);
        System.out.println("main a : "+a);
        sum();
    }
}
