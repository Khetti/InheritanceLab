import Staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void Manager(){
        manager = new Manager("Craig", "NP329186G", 36000, "Heehaw");
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Heehaw", manager.getDeptName());
    }

    @Test
    public void canGetName(){
        assertEquals("Craig", manager.getName());
    }

    @Test
    public void canGetSalary(){
        assertEquals(36000, manager.getSalary(), 0.00);
    }

    @Test
    public void canGetNationalInsuranceNo(){
        assertEquals("NP329186G", manager.getNationalInsuranceNo());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(1000);
        assertEquals(37000, manager.getSalary(), 0.00);
    }

    @Test
    public void canCalculateBonus(){
        assertEquals(360, manager.payBonus(), 0.00);
    }
}
