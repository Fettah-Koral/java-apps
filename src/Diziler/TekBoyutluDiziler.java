package Diziler;

public class TekBoyutluDiziler {
    public static void main(String[] args) {
        String [] days =  {"Pazartesi","Sali","Carsamba","Persembe","Cuma"};
        String [] weekendDays = new String[]{"Cumartesi","Pazar"};
        String [] names;
        names =new String[]{"fettah","kadir"};

        String [] surnames;
        surnames =new String[]{"koral","parlak"};
        surnames[1]="karaca";

        System.out.println(days[3]);
        System.out.println("length : "+days.length);
        System.out.println(weekendDays[0]);
        System.out.println(names[1]);
        System.out.println(surnames[1]);
    }

}
