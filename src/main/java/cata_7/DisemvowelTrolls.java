package cata_7;
//Trolls are attacking your comment section!
//A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.
//Your task is to write a function that takes a string and return a new string with all vowels removed.
//For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".
//Note: for this kata y isn't considered a vowel.

import java.util.List;

public class DisemvowelTrolls {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(anotherDisemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(anotherDisemvowelTwo("What are you, a communist?"));
    }

    public static String disemvowel(String str) {
        List<Character> vowels = List.of('a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U');
        StringBuilder updStr = new StringBuilder();
        for (Character character: str.toCharArray()){
            if (!vowels.contains(character)){
                updStr.append(character);
            }
        }
        return updStr.toString();
    }

    public static String anotherDisemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

    public static String anotherDisemvowelTwo(String Z) {
        return Z.replaceAll("(?i)[aeiou]" , "");
    }
}
