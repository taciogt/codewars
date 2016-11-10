package kyu.eighth;

/**
 * Created by tacio on 10/11/16.
 * https://www.codewars.com/kata/57a0885cbb9944e24c00008e/train/java
 */
class Solution {
    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }
}

public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        return Solution.removeExclamationMarks(s);
    }
}
