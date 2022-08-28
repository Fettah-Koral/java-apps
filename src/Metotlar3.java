public class Metotlar3 {


    //    Metotlarda Overloading....
    static void print() {
        System.out.println("paremetresiz metot");
    }

    static void print(int a) {
        System.out.println("tek paremetre : " + a);
    }

    static void print(double a) {
        System.out.println("double paremetre : " + a);
    }

    static int print(int sayi, int sayi2) {
        return sayi + sayi2;
    }

    static double print(double sayi, double sayi2) {
        return sayi + sayi2;
    }

    static double print(int a, int b, int c) {
        return a / b + c;
    }


    public static void main(String[] args) {
        print();
        print(8);
        print(8.6);
        System.out.println(print(5, 6));
        System.out.println(print(5., 6));
        System.out.println(print(12, 4, 7));
    }
}
