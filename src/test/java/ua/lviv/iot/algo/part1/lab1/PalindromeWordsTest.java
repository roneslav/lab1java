package ua.lviv.iot.algo.part1.lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeWordsTest {
    private PalindromeWords palindromeWords;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        palindromeWords = new PalindromeWords();
    }

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testIsPalindrome() {
        assertTrue(palindromeWords.isPalindrome("racecar"));
        assertFalse(palindromeWords.isPalindrome("hello"));
    }

    @Test
    public void testPrintPalindromeWordsForNull() {
        palindromeWords.printPalindromeWords(null, 1);
        assertEquals("Text is empty\n", outContent.toString());
    }

    @Test
    public void testPrintPalindromeWordsWithEmptyText() {
        palindromeWords.printPalindromeWords("tool, racecar, lttl, dead", 3);
        assertEquals("Palindrome words in the text:racecarlttl", outContent.toString());
    }

    @Test
    public void testPrintPalindromeWords() {
        palindromeWords.printPalindromeWords("tool, dead", 5);
        assertEquals("Palindrome words in the text:", outContent.toString());
    }

 /*  @Test
    public void testLengthGreaterThanWord(){
        palindromeWords.printPalindromeWords("racecar", 10);
        assertFalse();
    } */
   /* @Test
    public void testPrintPalindromeWordsWithNoPalindromeWordsFound() {
        PalindromeWords finder = new PalindromeWords();
        ArrayList <String> palindromeWords = new ArrayList<>();
        palindromeWords.add("racecar");
        palindromeWords.add("level");
        palindromeWords.add("deified");
        palindromeWords.add("bob");
      //  finder.printPalindromeWords(palindromeWords.toString(), 4);
        assertTrue(outContent.toString());
    }*/
    @Test
    public void testPrintPalindromeWordsWithOnePalindromeWordFound() {
        ArrayList <String> palindromeWords = new ArrayList<>();
        PalindromeWords pw = new PalindromeWords();
        pw.printPalindromeWords("A racecar lived as a devil at NASA", 5);
        assertTrue(palindromeWords.contains("racecar"));
    }
}