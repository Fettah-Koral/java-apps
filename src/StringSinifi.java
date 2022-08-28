import java.util.Arrays;

public class StringSinifi {
    public static void main(String[] args) {
        String str = "patika.DEV" ;
        String [] sp = str.split("a");

        System.out.println(str.charAt(3));
        System.out.println(str.contains("pa"));
        System.out.println(str.indexOf("k"));
        System.out.println(str.isEmpty());
        System.out.println(str.replace("k","l"));
        System.out.println(Arrays.toString(sp));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

    }
}
