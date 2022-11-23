import org.junit.Test;

import static org.junit.Assert.*;

public class AdminTest {

    @Test
    public void adminOperations1() throws Exception {
        Admin a = new Admin("TO000","Toyota",1000,2022,"1st",6,5.5,"no");

        assertTrue(a.adminOperations1(),true);

    }

    @Test
    public void adminOperations3() throws Exception {
        Admin a = new Admin(null,null,0,0,null,0,0,null);

        assertTrue(a.adminOperations3(),true);
    }

}