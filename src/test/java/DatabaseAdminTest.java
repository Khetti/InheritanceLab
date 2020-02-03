import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void DatabaseAdmin(){
        databaseAdmin = new DatabaseAdmin("Davey", "YT032911F", 40000);
    }

    @Test
    public void canGetName(){
        assertEquals("Davey", databaseAdmin.getName());
    }

    @Test
    public void canGetNationalInsuranceNo(){
        assertEquals("YT032911F", databaseAdmin.getNationalInsuranceNo());
    }

    @Test
    public void canGetSalary(){
        assertEquals(40000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(1000);
        assertEquals(41000, databaseAdmin.getSalary(), 0.00);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(400, databaseAdmin.payBonus(), 0.00);
    }
}
