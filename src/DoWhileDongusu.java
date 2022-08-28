import java.util.Scanner;

public class DoWhileDongusu {
    public static void main(String[] args) {

        boolean isPasswordCorrect = false;
        int correctAnswer = 456;
        int pwrd;
        Scanner input = new Scanner(System.in);

//        döngü bounca yapmak istediğin şeyleri do ' nun içine yaz farklı olarak do kullanırsan
//        kosula bakmadan önce birkez çaılştırır (yani kodalr do' nun içine yazılır.)
//        !! (do - while) da once kod çalıştırılır sonra koşula bakılır
//        while de ise önce koşula bakılır sonra kod çalıştırılır

        do {
            System.out.print("enter your password : ");
            pwrd = input.nextInt();
            if (pwrd == correctAnswer) {
                System.out.println("you have succsesfully enter");
                isPasswordCorrect = true;
            } else {
                System.out.println("your password is wrong please try again");
            }
        } while (!isPasswordCorrect);

    }
}
