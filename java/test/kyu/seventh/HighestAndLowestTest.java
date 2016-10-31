package kyu.seventh;

//import static org.junit.Assert.*;

import org.junit.Test;

//import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;

/**
 * Created by tacio on 31/10/16.
 */
public class HighestAndLowestTest {
        @Test
        public void Test1() {
            assertEquals("42 -9", HighestAndLowest.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        }

}