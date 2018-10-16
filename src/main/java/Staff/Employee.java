package Staff;

public abstract class Employee {
    private String name;
    private Double salary;
    private String niNumber;

    public Employee(String name, Double salary, String niNumber){
        this.name = name;
        this.salary = salary;
        this.niNumber = niNumber;
    }


    public Double getSalary() {
        return this.salary;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        if(!name.equals(null)){
            this.name = name;
        }
    }

    protected void setSalary(double salary) {
        this.salary = salary;
    }
}
