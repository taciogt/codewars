package kyu.eighth;

import java.util.ArrayList;

/**
 * Created by tacio on 01/11/16.
 * https://www.codewars.com/kata/number-of-people-in-the-bus/train/java
 */
public class NumberOfPeopleInTheBus {
    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] stop :stops) {
            result += (stop[0] - stop[1]);

        }
        return result;
    }
}
