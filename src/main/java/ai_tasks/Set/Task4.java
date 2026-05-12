package ai_tasks.Set;

import java.util.*;

//У тебя есть список слов:
//List<String> words = new ArrayList<>(Arrays.asList(
//    "apple", "banana", "cherry", "apple", "banana", "date", "cherry", "apple"
//));
//Напиши код который выведет:
//Слова которые встречаются более одного раза (дубли)
//Слова которые встречаются ровно один раз (уникальные)
//Попробуй решить используя только HashSet — без HashMap и подсчёта вхождений!
public class Task4 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList(
                "apple", "banana", "cherry", "apple", "banana", "date", "cherry", "apple"
        ));
        getResult(words);
    }

    public static void getResult(List<String> sList){
        Set<String> allWords = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String s: sList){
            if (!allWords.add(s)){
                duplicates.add(s);
            }
        }
        System.out.println(duplicates);
        allWords.removeAll(duplicates);
        System.out.println(allWords);
    }

}
