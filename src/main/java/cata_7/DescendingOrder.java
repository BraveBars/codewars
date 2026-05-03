package cata_7;

import java.util.Arrays;
import java.util.Collections;

//Your task is to make a function that can take any non-negative integer as an argument and return it with its digits in descending order. Essentially, rearrange the digits to create the highest possible number.
//Examples:
//Input: 42145 Output: 54421
//Input: 145263 Output: 654321
//Input: 123456789 Output: 987654321
public class DescendingOrder {
    public static void main(String[] args) {
        System.out.println(sortDesc(42145));
    }

    public static int sortDesc(final int num) {
        String[] numbers = (Integer.toString(num)).split("");
        Arrays.sort(numbers);
        StringBuilder result = new StringBuilder();
        for(String s : numbers)
        {
            result.append(s);
        }
        return Integer.parseInt(result.reverse().toString());
    }

    public static int anotherSortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.parseInt(String.join("", array));
    }
}
