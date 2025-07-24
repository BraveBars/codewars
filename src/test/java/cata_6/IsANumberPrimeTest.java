package cata_6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsANumberPrimeTest {

    @Test
    public void testIsPrime() {
        assertFalse("0  is not prime", IsANumberPrime.isPrime(0));
        assertFalse("1  is not prime", IsANumberPrime.isPrime(1));
        assertTrue ("2  is prime",     IsANumberPrime.isPrime(2));
        assertTrue ("73 is prime",     IsANumberPrime.isPrime(73));
        assertFalse("75 is not prime", IsANumberPrime.isPrime(75));
        assertFalse("-1 is not prime", IsANumberPrime.isPrime(-1));
    }

    @Test
    public void testIsPrimeOptimized() {
        assertFalse("0  is not prime", IsANumberPrime.isPrimeOptimized(0));
        assertFalse("1  is not prime", IsANumberPrime.isPrimeOptimized(1));
        assertTrue ("2  is prime",     IsANumberPrime.isPrimeOptimized(2));
        assertTrue ("73 is prime",     IsANumberPrime.isPrimeOptimized(73));
        assertFalse("75 is not prime", IsANumberPrime.isPrimeOptimized(75));
        assertFalse("-1 is not prime", IsANumberPrime.isPrimeOptimized(-1));
    }
}
