package Staff;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, Double salary, String niNumber,String deptName){
        super(name,salary,niNumber);
        this.deptName = deptName;

    }

    public String getDepartmentName() {
        return this.deptName;
    }


    public void raiseSalary(double percentage){
        this.setSalary(this.getSalary() * percentage);
    }

    public double getBonus() {
       return getSalary() * 0.01;
    }
}
