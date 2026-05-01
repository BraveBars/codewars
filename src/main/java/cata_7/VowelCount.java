package cata_7;
//Return the number (count) of vowels in the given string.
//We will consider a, e, i, o, u as vowels for this Kata (but not y).
//The input string will only consist of lower case letters and/or spaces.

import java.util.List;

public class VowelCount {
    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
        System.out.println(anotherGetCount("abracadabra"));
    }

    public static int getCount(String str) {
        List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');
        int counter = 0;
        for (Character ch : str.toCharArray()) {
            if (vowels.contains(ch)) {
                counter++;
            }
        }
        return counter;
    }

    public static int anotherGetCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
