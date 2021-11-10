package day48;

// a non-abstract subclass of abstract super class
// is called concrete class
// This class is responsible providing body (implementation)
// for all abstract methods from super class.

public class FullTimeEmployee extends Employee {


    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
//        this.name = name ;
//        this.id =id ;
        this.monthlySalary = monthlySalary;
    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("FullTime Employee yearly : " + monthlySalary * 12  );

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", monthlySalary=" + monthlySalary +
                ", yearly : " + monthlySalary * 12 +
                '}';
    }
}

