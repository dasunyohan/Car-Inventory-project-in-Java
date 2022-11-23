import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class OwnerTest {

    @Test
    public void ownerOperation1() throws FileNotFoundException {
        Owner o = new Owner();
        assertTrue(o.ownerOperation1(),true);
    }

    @Test
    public void ownerOperation2() throws FileNotFoundException {
        Owner o = new Owner();
        assertTrue(o.ownerOperation2(),true);
    }

    @Test
    public void ownerOperation3() throws FileNotFoundException {
        Owner o = new Owner();
        assertTrue(o.ownerOperation3(),true);
    }
}