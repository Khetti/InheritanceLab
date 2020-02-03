import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void Director(){
        director = new Director("John", "DD585098B", 120000, "Pretty much just conference calls", 2000000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000000, director.getBudget(), 0.00);
    }

}
