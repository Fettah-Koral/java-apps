public class Metotlar {

//    geriye bir değer döndürmeyen metotlarda void yazılır.

    static void helloWorld(){
        System.out.println("merhaba kodluyoruz ekibi");
    }


//      Statik bir metot içinde yalnızca statik metotlar çağrılabilir bu yuzden basına static ekledik

    static int power (int base,int exp){
        int result =1;
        for (int i=1 ; i<=exp; i++ ){
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {



//        int base = 2 , exp = 5 , result =1;
//        for (int i=1; i <= exp; i++) {
//            result *= base;
//        }
//        System.out.println(result);
        System.out.println(power(5,3));
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();
        helloWorld();

    }
}
