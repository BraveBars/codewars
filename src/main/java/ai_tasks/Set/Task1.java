package ai_tasks.Set;

import java.util.*;

//У тебя есть список слов:
//List<String> words = new ArrayList<>(Arrays.asList(
//    "apple", "banana", "apple", "cherry", "banana", "apple", "date"
//));
//
//Напиши код который:
//Выведет только уникальные слова
//Выведет количество дублей (сколько слов было удалено)
public class Task1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "apple", "cherry", "banana", "apple", "date"));
        Set<String> result = new HashSet<>(words);
        System.out.println(result);
        System.out.println(words.size() - result.size());
    }
}
