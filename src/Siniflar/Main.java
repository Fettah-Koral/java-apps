package Siniflar;



public class Main {
    public static void main(String[] args) {

        Car audi = new Car("audi",80,"red");
        audi.color="blue";
        audi.printInfo();
        System.out.println("===================");

        Car porche =new Car();
        porche.speed=250;
        porche.model="sports";
        porche.color = "black";
        porche.speedLimit=423;
        porche.printInfo();
        System.out.println("===================");

//        audi.printSpeed();

        /*
        audi.model = "Audi";
        audi.speed = 50;
        audi.increaseSpeed(20);
        audi.printSpeed();
//        System.out.println(audi.model+"'s speed is : "+audi.speed);
        Car bmw = new Car();
        bmw.model = "Bmw";
        bmw.color = "Red";
        bmw.type = "Sedan";
        bmw.speed = 99;
        bmw.increaseSpeed(80);
        bmw.printSpeed();
//        System.out.println(bmw.model + "'s Speed is : "+bmw.speed+" , type is : "+bmw.type);

        Car mercedes = new Car();
        mercedes.speed = 120;
        mercedes.model = "mercedes";

//        System.out.println("mercedes's type is :"+mercedes.type);
        mercedes.decreaseSpeed(10);
        mercedes.printSpeed();
*/

    }
}
