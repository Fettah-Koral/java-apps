package MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    double tax(){
        double tax=0;
        if(this.salary<=1000)tax=0;
        else tax=this.salary*0.03;
        return tax;
    }
     double bonus(){
         double bonus=0;
        if(this.workHours>40) bonus=(this.workHours-40)*30;
        return bonus;
    }
    double raiseSalary(){
        int thisYear=2021;
        int workYear=thisYear-this.hireYear;
        double raise;
        if(workYear<10) raise=this.salary*1.05;
        else if(workYear>9&workYear<20) raise=this.salary*1.1;
        else raise= this.salary*.15;
        return raise;
    }

    void toStringInfo(){
        System.out.println("Adi : "+this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calisma Saati : "+this.workHours);
        System.out.println("Baslangic yili : "+this.hireYear);
        System.out.println("Vergi : "+tax());
        System.out.println("Bonus : "+bonus());
        System.out.println("Maas artisi : "+raiseSalary());
        System.out.println("Vergi ve bonuslar ile maas  : "+(bonus()-tax()+this.salary));
        System.out.println("Toplam maas  : "+(raiseSalary()+this.salary));
    }


}
