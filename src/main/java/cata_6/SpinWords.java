/*
Write a function that takes in a string of one or more words,
and returns the same string, but with all words that have five or more letters reversed
(Just like the name of this Kata). Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.

Examples:

        "Hey fellow warriors"  --> "Hey wollef sroirraw"
        "This is a test"        --> "This is a test"
        "This is another test" --> "This is rehtona test"
*/
package cata_6;

import java.util.Arrays;

public class SpinWords {
    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));
        System.out.println(spinWords("This is a test" ));
        System.out.println(spinWords("This is another test"));
        System.out.println(spinWordsStream("Hey fellow warriors"));
        System.out.println(spinWordsStream("This is a test" ));
        System.out.println(spinWordsStream("This is another test"));
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) {
                result.append(new StringBuilder(words[i]).reverse());
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1){
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static String spinWordsStream(String sentence) {
        return String.join(" ",
                Arrays.stream(sentence.split(" "))
                        .map(word -> word.length() >= 5?
                                new StringBuilder(word).reverse().toString() : word)
                        .toArray(String[]::new));
    }
}
