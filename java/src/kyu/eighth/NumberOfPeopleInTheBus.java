package kyu.eighth;

import java.util.ArrayList;

/**
 * Created by tacio on 01/11/16.
 * https://www.codewars.com/kata/number-of-people-in-the-bus/train/java
 */
public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int[] reducedStopsStream = stops.stream().reduce(new int[]{0, 0}, (a, b) -> new int[]{a[0] + b[0], a[1] + b[1]});
        return reducedStopsStream[0] - reducedStopsStream[1];
    }
}
