package cata_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMultiplicationTest {
    @Test
    public void simpleMultiplicationTest1() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, SimpleMultiplication.simpleMultiplication(1));
        assertEquals(27, SimpleMultiplication.simpleMultiplication(3));
        assertEquals(189, SimpleMultiplication.simpleMultiplication(21));
        assertEquals(207, SimpleMultiplication.simpleMultiplication(23));
    }
    @Test
    public void simpleMultiplicationTest1_2() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, SimpleMultiplication.simpleMultiplication2(1));
        assertEquals(27, SimpleMultiplication.simpleMultiplication2(3));
        assertEquals(189, SimpleMultiplication.simpleMultiplication2(21));
        assertEquals(207, SimpleMultiplication.simpleMultiplication2(23));
    }

    @Test
    public void simpleMultiplicationTest2() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, SimpleMultiplication.simpleMultiplication(2));
        assertEquals(32, SimpleMultiplication.simpleMultiplication(4));
        assertEquals(176, SimpleMultiplication.simpleMultiplication(22));
        assertEquals(208, SimpleMultiplication.simpleMultiplication(26));
    }
    @Test
    public void simpleMultiplicationTest2_2() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, SimpleMultiplication.simpleMultiplication2(2));
        assertEquals(32, SimpleMultiplication.simpleMultiplication2(4));
        assertEquals(176, SimpleMultiplication.simpleMultiplication2(22));
        assertEquals(208, SimpleMultiplication.simpleMultiplication2(26));
    }
}
