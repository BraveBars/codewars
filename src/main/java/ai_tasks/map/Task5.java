package ai_tasks.map;

import java.util.*;

//У тебя есть текст:
//String text = "apple banana apple cherry banana apple cherry cherry mango";
//Напиши код который:
//
//Подсчитает сколько раз встречается каждое слово
//Выведет только слова которые встречаются больше одного раза
//Выведет их отсортированными по алфавиту
public class Task5 {
    public static void main(String[] args) {
        String text = "apple banana apple cherry banana apple cherry cherry mango";
        String[] textArr = text.trim().split(" ");
        Map<String, Integer> result = new HashMap<>();
        for (String s: textArr){
            result.put(s, result.getOrDefault(s, 0) + 1);
        }
        System.out.println(result);

        List<String> resultSorted = new ArrayList<>();
        for (Map.Entry<String, Integer> entry: result.entrySet()){
            if (entry.getValue() > 1){
                resultSorted.add(entry.getKey());
            }
        }
//        resultSorted.sort((a, b) -> a.compareTo(b));
        Collections.sort(resultSorted);
        System.out.println(resultSorted);
    }
}
