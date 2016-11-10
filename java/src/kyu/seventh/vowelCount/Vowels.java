package kyu.seventh.vowelCount;

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