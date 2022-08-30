package Siniflar;

class Car {

    //    Nitelikler değişkenler ile tanılmlanır ve class'ın hemen altına nitelikleri tanımlamak jargondur.

    String type = "liquid fuel";
    String model = "Test";
    String color;
    int speed;
    int speedLimit = 180;

    /*  Constructor (Kurucu ) metot aşağıdaki şekilde tanımlanır.
        Constructor metot nesnenin özelliklerinin nesne tanımlanırken
        nesnein özelliklerinin paremetre şeklinde verilmesine olanak tanır

        Constuctor metot ile sınıf ismi aynı olmalıdır.
        */

    //    burada local değişkenlerin isimlerini de nitelikler ile aynı vermek bir jargondur.
    //    sınıfa ait değişkenlerin başına this koyulmalıdır.
    Car(String model, int speed ,String color) {
        this.model = model;
        this.speed = speed;
        this.type ="Sedan";
        this.color = color;
        this.speedLimit = 190;
        System.out.println("Paremeteli kurucu methodu olustu.");
    }
    Car(){
        System.out.println("Bos kurucu methodu olustu.");
    }


    // Davranışlar ise metotlatlar tanımlanır ve niteliklerin altında yer alırlar.
    void increaseSpeed(int increment) {
        if (this.speed + increment < speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {

        decrease = decrease > this.speed ? this.speed : decrease;
        this.speed -= decrease;
    }

    void printSpeed() {
        System.out.println(this.model + "'s speed is : " + this.speed);
    }

    void printInfo(){
        System.out.println("Model \t: "+this.model);
        System.out.println("Speed \t: "+this.speed);
        System.out.println("Type \t: "+this.type);
        System.out.println("Color \t: "+this.color);
    }

}











