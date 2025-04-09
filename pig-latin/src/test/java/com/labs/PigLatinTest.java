package com.labs;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PigLatinTest {
    PigLatin p = new PigLatin();

    /**
     * The pig latin form of "banana" is "ananabay".
     */
    @Test
    public void pigLatinTest1() {
        String input = "banana";
        String expected = "ananabay";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for 'banana'");
    }

    /**
     * The pig latin form of "pear" is "earpay".
     */
    @Test
    public void pigLatinTest2() {
        String input = "pear";
        String expected = "earpay";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for 'pear'");
    }

    /**
     * The pig latin form of "peach" is "eachpay".
     */
    @Test
    public void pigLatinTest3() {
        String input = "peach";
        String expected = "eachpay";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for 'peach'");
    }

    /**
     * Testing a single-character word.
     */
    @Test
    public void pigLatinSingleCharacterTest() {
        String input = "a";
        String expected = "aay";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for single-character word 'a'");
    }

    /**
     * Testing an empty string.
     */
    @Test
    public void pigLatinEmptyStringTest() {
        String input = "";
        String expected = "";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for empty string");
    }

    /**
     * Testing a null string.
     */
    @Test
    public void pigLatinNullStringTest() {
        String input = null;
        String expected = "";
        String actual = p.returnPigLatin(input);
        assertEquals(expected, actual, "Pig Latin conversion failed for null input");
    }
}