package ai_tasks.hashMap;

import java.util.*;

//У тебя есть список слов:
//List<String> words = new ArrayList<>(Arrays.asList(
//    "apple", "banana", "cherry", "avocado", "blueberry", "apricot", "cranberry"
//));
//Напиши код который выведет все слова начинающиеся на каждую букву которая встречается в списке.
//Ожидаемый вывод:
//a: [apple, avocado, apricot]
//b: [banana, blueberry]
//c: [cherry, cranberry]
public class Task8 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "avocado", "blueberry", "apricot", "cranberry"
        ));
        Map<Character, List<String>> map = new TreeMap<>();

        for (String s : words) {
            char ch = s.charAt(0);
            map.computeIfAbsent(ch, k -> new ArrayList<>()).add(s);
        }

        for (Map.Entry<Character, List<String>> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
