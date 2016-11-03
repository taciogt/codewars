package kyu.seventh.vowelCount;

import com.sun.deploy.util.StringUtils;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;

/**
 * Created by tacio on 03/11/16.
 * https://www.codewars.com/kata/vowel-count/train/java
 */

public class Vowels {

    public static int getCount(String str) {
        long vowelsCount = str.
                chars().
                mapToObj(i -> new Character((char)i)).
                filter(i -> "aeiou".contains(i.toString())).
                count();

        return (int) vowelsCount;
    }

}