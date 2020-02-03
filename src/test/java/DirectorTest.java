import Staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void Director(){
        director = new Director("John", "DD585098B", 120000, "Conference Calls", 2000000);
    }

    @Test
    public void canGetBudget(){
        assertEquals(2000000, director.getBudget(), 0.00);
    }

    @Test
    public void canGetName(){
        assertEquals("John", director.getName());
    }

    @Test
    public void canGetNationalInsuranceNo(){
        assertEquals("DD585098B", director.getNationalInsuranceNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(120000, director.getSalary(), 0.00);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Conference Calls", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(130000, director.getSalary(), 0.00);
    }

    @Test
    public void canHandleNegativeRaise(){
        director.raiseSalary(-10000);
        assertEquals(120000, director.getSalary(), 0.00);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(2400, director.payBonus(), 0.00);
    }

    @Test
    public void canSetName(){
        director.setName("James");
        assertEquals("James", director.getName());
    }

    @Test
    public void canRejectNull(){
        director.setName(null);
        assertEquals("John", director.getName());
    }

}
