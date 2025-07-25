package cata_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FakeBinaryTest {
    @Test
    public void testSomething() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin("366058562030849490134388085"));
    }

    @Test
    public void testSomething2() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBin2("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBin2("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBin2("366058562030849490134388085"));
    }

    @Test
    public void testSomethingStream() {
        FakeBinary fakeBinary = new FakeBinary();
        assertEquals("01011110001100111", fakeBinary.fakeBinStream("45385593107843568"));
        assertEquals("101000111101101", fakeBinary.fakeBinStream("509321967506747"));
        assertEquals("011011110000101010000011011", fakeBinary.fakeBinStream("366058562030849490134388085"));
    }
}
