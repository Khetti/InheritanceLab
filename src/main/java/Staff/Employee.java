package Staff;

public abstract class Employee {

    private String name;
    private String nationalInsuranceNo;
    private double salary;

    public Employee(String name, String nationalInsuranceNo, double salary){
        this.name = name;
        this.nationalInsuranceNo = nationalInsuranceNo;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNationalInsuranceNo(){
        return this.nationalInsuranceNo;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double salaryRaise){
        if (salaryRaise < 0){
            salaryRaise = 0;
        }
        this.salary += salaryRaise;
    }

    public double payBonus(){
        double bonus = (this.salary / 100);
        return bonus;
    }


    public void setName(String newName) {
        this.name = newName;
    }
}
