import org.junit.Test;

import static org.junit.Assert.*;

public class customerAppointmentTest {

    @Test
    public void customerOperation() throws Exception {
        customerAppointment c = new customerAppointment(null,null,null,null,null);

        assertTrue(c.customerOperation(),true);
    }

    @Test
    public void customerOperation4() throws Exception {
        customerAppointment c = new customerAppointment(null,null,null,null,null);

        assertTrue(c.customerOperation4(),true);
    }
}