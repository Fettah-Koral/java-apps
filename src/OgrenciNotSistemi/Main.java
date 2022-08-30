package OgrenciNotSistemi;

public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mahmut Hoca","905076541215","TRH");
        Teacher t2 = new Teacher("Graham bell","2126546578","FZK");
        Teacher t3 = new Teacher("Kulyutmaz","0525798409","BIO");


        Course tarih =new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course biyo= new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("inek saban","123","4",tarih,fizik,biyo);
        s1.addBulkExamNote(45,27,68);
        s1.addBulkOralNote(50,0.2,"101");
        s1.addBulkOralNote(80,0.25,"102");
        s1.addBulkOralNote(75,0.3,"103");
        s1.isPass();

        Student s2 = new Student("Guduk necmi","444","4",tarih,fizik,biyo);
        // s2.addBulkExamNote(50,33,70);
        // s2.isPass();


    }
}
