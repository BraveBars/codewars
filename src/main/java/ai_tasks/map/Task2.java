package ai_tasks.map;
//**Задача 2:**
//У тебя есть список заказов:
//List<String> orders = new ArrayList<>(Arrays.asList(
//    "pizza", "burger", "pizza", "sushi", "burger",
//    "pizza", "sushi", "sushi", "burger", "pizza"
//));
//
//Напиши код который:
//1. Подсчитает сколько раз заказывали каждое блюдо
//2. Выведет блюда отсортированные по популярности (от самого популярного к менее популярному)
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> orders = new ArrayList<>(Arrays.asList(
                "pizza", "burger", "pizza", "sushi", "burger",
                "pizza", "sushi", "sushi", "burger", "pizza"
        ));
        Map<String, Integer> counter = new HashMap<>();
        for (String s: orders){
            counter.put(s, counter.getOrDefault(s, 0) + 1);
        }

        System.out.println(counter);

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(counter.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());
        System.out.println(entries);
    }
}
