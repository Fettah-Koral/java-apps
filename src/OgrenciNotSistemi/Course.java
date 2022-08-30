package OgrenciNotSistemi;

public class Course {
    // niteliklerde bir nesne var ise en üste yazılır.
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int oralNote;

    Course(String name, String code, String prefix) {  //, Teacher teacher
     // this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.oralNote=0;
    }
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            //printTeacher();
        }
        else {
            System.out.println("Ogretmen ve ders bolumleri uyusmuyor!");
        }

    }

    void printTeacher(){
        System.out.println("\n__________________________________\n ");
        this.teacher.print();
    }






   /* void printCourseInfo(){
        System.out.println("Dersin \n__________________________________");
        System.out.println("adi : "+this.name);
        System.out.println("kodu : "+this.code);
        System.out.println("bolumu : "+this.prefix);
        System.out.println("ogretmeni : "+this.teacher.name);
        System.out.println("notu : "+this.note);
    }*/

}
