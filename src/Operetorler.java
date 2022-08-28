import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;

public class Operetorler {

    public static void main(String[] args) {
        /*
        *  a++   >>> 1 arttırma
        *  a--   >>> 1 azaltma
        *
        *  a+=b  >>> a = a+b
        *  a-=b  >>> a = a-b
        *  a*=b  >>> a = a*b
        *  a/=b  >>> a = a/b
        *  a%=b  >>> a = a%b
        *
        * ----------------------------------------
        *
        *   and  >>>     a&&b
        *   or   >>>     a||b
        *   not  >>>     !(expression)
        *
        *   ifadenin başına '!' konulduğunda değilini alır.
        * */

//        int a=5,b=6,c=5;
//        boolean kosul1 = a==c;
//        boolean kosul2 = a>=b;
//        boolean sonuc = kosul1 || kosul2;
//        //   '?'   kosul operatörü ifadenin sonucunda oluşacak olayları belirler.
//
//        String str = sonuc ? "Dogru":"Yanlis";
//        int result = !sonuc ?  1 : 0 ;
//
//        System.out.println(str);
//        System.out.println(result);
//        System.out.println(sonuc);
//        System.out.println(!sonuc);

        int a = 10 ,b = 20,c = 5;

        boolean kosul1 = (a<b);
        boolean kosul2 = (a>c);

        System.out.println(kosul1 && kosul2 ? "dogru":"yanlıs" );

    }

}
