package cata_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TakeATenMinutesWalkTest {
    @Test
    public void falseWalkTooShort() {
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n', 's'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n', 's', 'e', 'w'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n', 's', 'e', 'w', 'n', 's', 'e', 'w'}));
    }

    @Test
    public void falseWalkTooLong() {
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s','n','s'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w','n','s','e','w'}));
    }

    @Test
    public void falseDoesNotLoopBackToStart() {
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','n'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'e','e','e','w','n','s','n','s','e','w'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','e','n','e','n','e','n','e','n','e'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'n','w','n','w','n','w','n','w','n','w'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'s','e','s','e','s','e','s','e','s','e'}));
        assertFalse(TakeATenMinutesWalk.isValid(new char[] {'s','w','s','w','s','w','s','w','s','w'}));
    }

    @Test
    public void trueIsValid10MinutesWalk() {
        assertTrue(TakeATenMinutesWalk.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
        assertTrue(TakeATenMinutesWalk.isValid(new char[] {'e','w','e','w','n','s','n','s','e','w'}));
        assertTrue(TakeATenMinutesWalk.isValid(new char[] {'n','s','e','w','n','s','e','w','n','s'}));
        assertTrue(TakeATenMinutesWalk.isValid(new char[] {'n','n','n','n','n','s','s','s','s','s'}));
        assertTrue(TakeATenMinutesWalk.isValid(new char[] {'e','e','e','e','e','w','w','w','w','w'}));
    }
}
