package cata_8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveStringSpacesTest {
    @Test
    public void noSpaceTest() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpace("8j aam"));
    }

    @Test
    public void noSpaceEasyTest() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpaceEasy("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpaceEasy("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpaceEasy("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpaceEasy("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpaceEasy("8j aam"));
    }

    @Test
    public void noSpaceStreamTest() {
        assertEquals("8j8mBliB8gimjB8B8jlB", RemoveStringSpaces.noSpaceStream("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", RemoveStringSpaces.noSpaceStream("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", RemoveStringSpaces.noSpaceStream("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", RemoveStringSpaces.noSpaceStream("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", RemoveStringSpaces.noSpaceStream("8j aam"));
    }
}
