package kyu.eighth;

import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tacio on 01/11/16.
 *
 */
public class NumberOfPeopleInTheBusTest {

    NumberOfPeopleInTheBus metro = new NumberOfPeopleInTheBus();

    @Test
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, metro.countPassengers(list));
    }
}