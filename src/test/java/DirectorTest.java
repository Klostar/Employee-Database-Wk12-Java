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
    
}
