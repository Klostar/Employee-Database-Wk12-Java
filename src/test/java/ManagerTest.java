import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Staff.Manager manager;

    @Before
    public void before(){
    manager = new Staff.Manager("Sally Smith",17000.0,"JX123345D","HR");
    }


    @Test
    public void hasName(){
        assertEquals("Sally Smith", manager.getName());
    }
   @Test
   public void hasSalary(){
        assertEquals(17000.0, manager.getSalary(), 1);
   }

   @Test
    public void hasNiNumber(){
        assertEquals("JX123345D", manager.getNiNumber());
   }
   @Test
    public void getDepartmentName(){
        assertEquals("HR", manager.getDepartmentName());
   }
}
