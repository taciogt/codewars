package kyu.seventh.vowelCount;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tacio on 03/11/16.
 */
public class VowelsTest {
    @Test
    public void testCaseOneVowel() {
        assertEquals("Nope!", 1, Vowels.getCount("a"));
    }

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
}