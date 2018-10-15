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
}
