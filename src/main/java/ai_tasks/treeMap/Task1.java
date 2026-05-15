package ai_tasks.treeMap;

import java.util.*;

//У тебя есть список студентов и их оценок:
//List<String> students = new ArrayList<>(Arrays.asList(
//    "Charlie:85", "Alice:92", "Bob:78", "Diana:92", "Eve:65"
//));
//Напиши код который:
//
//Сохранит студентов в TreeMap где ключ — имя студента
//Выведет всех студентов в алфавитном порядке с оценками
public class Task1 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList(
                "Charlie:85", "Alice:92", "Bob:78", "Diana:92", "Eve:65"));
        Map<String, Integer> treeMap = new TreeMap<>();
        for (String s: students){
            String[] sArr = s.split(":");
            treeMap.put(sArr[0],Integer.parseInt(sArr[1]));
        }
        System.out.println(treeMap);
    }
}
