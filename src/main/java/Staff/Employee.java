package Staff;

public class Employee {
    private String name;
    private int salary;
    private String niNumber;

    public Employee(String name, int salary, String niNumber){
        this.name = name;
        this.salary = salary;
        this.niNumber = niNumber;
    }


    public int getSalary() {
        return this.salary;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public String getName() {
        return this.name;
    }
}
