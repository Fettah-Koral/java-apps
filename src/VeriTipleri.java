public class VeriTipleri {
    public static void main(String[] args) {

        byte vByte = 127;
        short vShort = 32760;
        int vInt = 2147483600;
        long vLong = 465658489;
        System.out.println(vByte);
        System.out.println(vShort);
        System.out.println(vInt);
        System.out.println(vLong);

        /* ondalıklı veri tipleri */
        float vFloat = 3.14f;  // sonuna "f" konulması gerekli.
        double vDouble =3.14;
        System.out.println(vFloat);
        System.out.println(vDouble);

        /* char ve boolean veri tipleri */
        char vChar ='b';
        char v2Char = 98;
        System.out.println(vChar);
        System.out.println(v2Char);

        boolean dogru = true ;
        boolean yanlis = false ;
        System.out.println(dogru);
        System.out.println(yanlis);

        String vStr = "muhammet fettah";
        System.out.println(vStr);
    }
}