import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee(17000,"JX123345D");
    }

   @Test
    public void hasSalary(){
        assertEquals(17000, employee.getSalary());
   }
}
