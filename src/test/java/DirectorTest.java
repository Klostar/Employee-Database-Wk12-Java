import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Craig McAfee",50000.0,"JS776544E","CEO",30000.0);
    }

    @Test
    public void getBudget(){
        assertEquals(30000, director.getBudget(),1);
    }
    @Test
    public void directorHasName(){
        assertEquals("Craig McAfee", director.getName());
    }
    @Test
    public void directorHasSalary(){
        assertEquals(50000, director.getSalary(),1);
    }
    @Test
    public void directorHasNiNjumber(){
        assertEquals("JS776544E", director.getNiNumber());
    }
    @Test
    public void directorHasDepartment(){
        assertEquals("CEO", director.getDepartmentName());
    }
    
}
