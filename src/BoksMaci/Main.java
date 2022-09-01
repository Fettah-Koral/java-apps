package BoksMaci;

public class Main {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("joe fraizer",15,120,85,30);
        Fighter f2 = new Fighter("mike tyson",20,85,100,40);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
