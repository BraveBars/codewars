package ai_tasks.map;

import java.util.*;
//Задача 3:
//У тебя есть два текста:
//String text1 = "the cat sat on the mat";
//String text2 = "the dog sat on the log";
//Напиши код который найдёт слова которые встречаются в обоих текстах.

public class Task3 {
    public static void main(String[] args) {
        String text1 = "the cat sat on the mat";
        String text2 = "the dog sat on the log";
        Set<String> text1Set = new HashSet<>(Arrays.asList(text1.split(" ")));
        Set<String> text2Set = new HashSet<>(Arrays.asList(text2.split(" ")));
        text1Set.retainAll(text2Set);
        System.out.println(text1Set);
    }
}
