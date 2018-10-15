package Staff;

public class Employee {
    private int salary;
    private String niNumber;

    public Employee(int salary, String niNumber){
        this.salary = salary;
        this.niNumber = niNumber;
    }


    public int getSalary() {
        return this.salary;
    }

    public String getNiNumber() {
        return this.niNumber;
    }
}
