package kyu.eighth;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by tacio on 10/11/16.
 */
public class RemoveExclamationMarksTest {
    @Test
    public void testSimpleString1() {
        assertEquals("Hello World", Solution.removeExclamationMarks("Hello World!"));
    }

}