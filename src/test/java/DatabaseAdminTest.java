import Staff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Daniel McPhail", 20000.0,"JZ184323A");

    }

    @Test
    public void adminHasName(){
        assertEquals("Daniel McPhail", databaseAdmin.getName());

    }
    @Test
    public void adminHasSalary(){
        assertEquals(20000, databaseAdmin.getSalary(),1);
    }
    @Test
    public void adminHasNiNumber(){
        assertEquals("JZ184323A", databaseAdmin.getNiNumber());
    }
}
