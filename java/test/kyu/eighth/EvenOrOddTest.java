package kyu.eighth;

import kyu.eighth.EvenOrOdd;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by tacio on 27/10/16.
 */
public class EvenOrOddTest {
    @Test
    public void testEvenOrOdd() {
        EvenOrOdd eoo = new EvenOrOdd();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
}
