package Staff.Management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, Double salary, String niNumber,String deptName, Double budget){
        super(name,salary,niNumber,deptName);
        this.budget = budget;

    }

    public double getBudget() {
        return this.budget;
    }
}
