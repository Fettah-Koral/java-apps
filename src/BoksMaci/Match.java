package BoksMaci;

public class Match {
    Fighter f1;
    Fighter f2;
    int maxWeight;
    int minWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.maxWeight = maxWeight;
        this.minWeight = minWeight;
    }

    void run() {
        if (isCheck()) {
            int round = 1;
            while (this.f1.health > 0 & this.f2.health > 0) {
                System.out.println("\n==============" + round + ".raund ==============");

                System.out.println(this.f1.name + "\t Saglik : " + this.f1.health);
                System.out.println(this.f2.name + "\t Saglik : " + this.f2.health);
                System.out.println("\n-----------------------------------");

                if (f1.isFirstHit()) {
                    System.out.println("ilk yumurugu " + f1.name + " atti.");
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                }
                else {
                    System.out.println("ilk yumurugu " + f2.name + " atti.");
                    this.f1.health = this.f2.hit(f1);
                    if (isWin()) break;
                    this.f2.health = this.f1.hit(f2);
                    if (isWin()) break;
                }


                round++;
            }

        } else {
            System.out.println("Sporcularin sikletleri uymuyor.");
        }
    }

    boolean isCheck() {
        return (this.f1.weight <= maxWeight && this.f1.weight >= minWeight) & (this.f2.weight <= maxWeight && this.f2.weight >= minWeight);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " karsilasmayi kazandi.");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println(this.f1.name + " karsilasmayi kazandi.");
            return true;
        }
        return false;
    }


}