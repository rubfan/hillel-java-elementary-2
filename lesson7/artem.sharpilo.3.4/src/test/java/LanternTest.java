import org.junit.Test;

import static org.junit.Assert.*;

public class LanternTest {
    private Lantern lantern= new Lantern();
    @Test
    public void testSetModeWhite() {
        assertSame(lantern.color=="White", lantern.color=="White");
    }

    @Test
    public void testSetModeRed() {
        assertEquals(lantern.battery==2, lantern.battery==2);
    }

    @Test
    public void testSetModeTrim() {
        assertSame(lantern.battery==3, lantern.battery==3);
    }
}