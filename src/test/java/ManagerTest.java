import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
    manager = new Manager("Sally Smith",17000.0,"JX123345D","HR");
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
   @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1.1);
        assertEquals(18700, manager.getSalary(),1);

   }
   @Test
    public void canGetBonus(){
        assertEquals(170.0, manager.getBonus(),1);
   }

}
