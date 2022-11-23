import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

public class TechnicianTest {

    @Test
    public void technicianOperations1() throws IOException, ClassNotFoundException {
        Technician t = new Technician(null,null,null,null,null,null,0);

        assertTrue(t.technicianOperations1(),true);
    }
}