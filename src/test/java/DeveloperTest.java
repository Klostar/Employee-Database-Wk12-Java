import Staff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Chloe Alcorn", 22000.0, "JX115642C");
    }

    @Test
    public void devHasSalary(){
        assertEquals(22000.0, developer.getSalary(),1);
    }

    @Test
    public void devHasName(){
        assertEquals("Chloe Alcorn", developer.getName());
    }
    @Test
    public void devHasNiNumber(){
        assertEquals("JX115642C", developer.getNiNumber());
    }
}
