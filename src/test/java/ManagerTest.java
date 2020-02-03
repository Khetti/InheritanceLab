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
}
