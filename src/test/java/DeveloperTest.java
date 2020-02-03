import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void Developer(){
        developer = new Developer("Greg", "AS450117K", 26000);
    }

    @Test
    public void canGetName(){
        assertEquals("Greg", developer.getName());
    }

    @Test
    public void canGetNationalInsuranceNo(){
        assertEquals("AS450117K", developer.getNationalInsuranceNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(26000, developer.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(500);
        assertEquals(26500, developer.getSalary(), 0.00);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(260, developer.payBonus(), 0.00);
    }
}
