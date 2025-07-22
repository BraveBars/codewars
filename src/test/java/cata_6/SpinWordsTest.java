package cata_6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void spinWordsTest() {
        assertEquals("Hey wollef sroirraw", SpinWords.spinWords("Hey fellow warriors"));
        assertEquals("This is a test" , SpinWords.spinWords("This is a test" ));
        assertEquals("This is rehtona test", SpinWords.spinWords("This is another test"));
        assertEquals("emocleW", SpinWords.spinWords("Welcome"));
    }

    @Test
    public void spinWordsStreamTest() {
        assertEquals("Hey wollef sroirraw", SpinWords.spinWordsStream("Hey fellow warriors"));
        assertEquals("This is a test" , SpinWords.spinWordsStream("This is a test" ));
        assertEquals("This is rehtona test", SpinWords.spinWordsStream("This is another test"));
        assertEquals("emocleW", SpinWords.spinWordsStream("Welcome"));
    }
}
