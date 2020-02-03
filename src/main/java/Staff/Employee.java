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



}
