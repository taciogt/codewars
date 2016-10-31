package kyu.seventh;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * Created by tacio on 31/10/16.
 * https://www.codewars.com/kata/highest-and-lowest/train/java
 */
public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        List<String> numbersStringArray = Arrays.asList(numbers.split(" "));
        List<Integer> numbersIntegerList = numbersStringArray.stream().map(Integer::parseInt).collect(toList());

        Collections.sort(numbersIntegerList);
        Integer max = numbersIntegerList.get(numbersIntegerList.size()-1);
        Integer min = numbersIntegerList.get(0);

        return String.format("%s %s", max, min);
    }
}
