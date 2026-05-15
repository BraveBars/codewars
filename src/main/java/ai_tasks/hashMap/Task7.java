package ai_tasks.hashMap;

import java.util.HashMap;
import java.util.Map;

//У тебя есть строка:
//String s = "aabbccddee";
//Напиши код который проверит является ли строка анаграммой другой строки:
//String t = "abcdeabcde";
//Анаграмма — это когда две строки содержат одинаковые буквы одинаковое количество раз, но в разном порядке.
//Примеры:
//
//"abc" и "cba" → анаграммы
//"abc" и "cbb" → не анаграммы
public class Task7 {
    public static void main(String[] args) {
        String s = "aabbccddee";
        String t = "abcdeabcde";
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (Character ch: s.toCharArray()){
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);
        }

        for (Character ch: t.toCharArray()){
            tMap.put(ch, tMap.getOrDefault(ch, 0) + 1);
        }

        System.out.println(sMap);
        System.out.println(tMap);
        System.out.println(sMap.equals(tMap));
    }
}
