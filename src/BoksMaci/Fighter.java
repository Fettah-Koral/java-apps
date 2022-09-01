package BoksMaci;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight,int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(dodge>=0&dodge<=100){
            this.dodge=dodge;
        }else {
            this.dodge=0;
        }

    }

    int hit(Fighter foe) {

        if(foe.isDodge()){
            System.out.println(foe.name+" gelen hasari blokladi.");
            return foe.health;
        }

        System.out.println(this.name + " ==> " + foe.name + " " + this.damage + " hasar vurdu.");

        if(foe.health-this.damage<0){
            return 0;
        }
        return (foe.health - this.damage);
    }

    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return (randomNumber<=this.dodge);
    }
    boolean isFirstHit(){
        if (Math.random()*100>50) return true;
        return false;
    }
}
