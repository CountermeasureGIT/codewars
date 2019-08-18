import org.junit.Test;

import static org.junit.Assert.*;

public class KataSolutionTest {
    @Test
    public void exampleTests() {
        assertEquals('e', Kata.findMissingLetter(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetter(new char[] { 'O','Q','R','S' }));

        assertEquals('e', Kata.findMissingLetterV2(new char[] { 'a','b','c','d','f' }));
        assertEquals('P', Kata.findMissingLetterV2(new char[] { 'O','Q','R','S' }));
    }
}