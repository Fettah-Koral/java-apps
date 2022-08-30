package OgrenciNotSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 <= 100 && note1 >= 0) {
            this.c1.note = note1;
        }
        if (note2 <= 100 && note2 >= 0) {
            this.c2.note = note2;
        }
        if (note3 <= 100 && note3 >= 0) {
            this.c3.note = note3;
        }
        printNote();

    }
    void addBulkOralNote(int note,double effectRate,String courseCode){
        if(note>=0 && note<=100){
            var course = this.c1;
            if (courseCode.equals(c2.code)) {
                course = this.c2;
            }
            if (courseCode.equals(c3.code)) {
                course = this.c3;
            }
            course.oralNote=note;
            course.note=(int)(effectRate*course.oralNote+(1-effectRate)*course.note);

            System.out.println("=============================");
            System.out.println(course.name+" sozlu notu : "+course.oralNote);
            System.out.println(course.name+" dersinde sozlu notu %"+effectRate*100+" , yazili notu %"+(1-effectRate)*100);
            System.out.println(course.name+" icin ortalama not : "+course.note);
        }


    }


    void isPass(){
        int sum = (this.c1.note+this.c2.note+this.c3.note);
        this.avarage=sum/3.0;

        if(this.avarage>=50){
            System.out.println("\nortalmaniz : "+this.avarage);
            System.out.println("ogrenci sinifi gecti.  :)");
            this.isPass=true;
        }
        else {
            System.out.println("ortalmaniz : "+this.avarage);
            System.out.println("\nogrenci sinifta kaldi.");
            this.isPass=false;
        }

    }

    void printNote() {

        int sum = (this.c1.note+this.c2.note+this.c3.note);
        this.avarage=sum/3.0;
        System.out.println("__________________________________ ");
        System.out.println(this.name + " isimli ogrencinin yazili notlari ");
        System.out.println("__________________________________ ");

        System.out.println(this.c1.name + " notu : " + this.c1.note);
        System.out.println(this.c2.name + " notu : " + this.c2.note);
        System.out.println(this.c3.name + " notu : " + this.c3.note);
        System.out.println("ortalmaniz : "+this.avarage);
    }


}
