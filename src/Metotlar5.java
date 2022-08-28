/**
 * @author : Muhammet Fettah Koral , 2-08-2022   12:18
 */


// Recursive (Öz yinelemeli) metotlar

public class Metotlar5 {
    /*
    static void print(){
        System.out.println("hello world");
        print();
    }*/

    static int f(int x) {
        int result = 0;
        for (int i = 1; i <= x; i++) {
            result += i;
        }
        return result;
    }

    static int r(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + r(n - 1);
        }
    }
//    return çalıştığı zaman altındaki kodları okumaz metodu

    public static void main(String[] args) {
//        print();
        System.out.println(f(9));
        System.out.println(r(9));
    }
}
