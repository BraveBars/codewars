package cata_8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ZeroFuelTest {
    @Test
    public void zeroFuelTest() {
        assertTrue(ZeroFuel.zeroFuel(50, 25, 2));
        assertFalse(ZeroFuel.zeroFuel(100, 50, 1));
    }
}
