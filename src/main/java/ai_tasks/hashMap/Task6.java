package ai_tasks.hashMap;

import java.util.*;

//У тебя есть список транзакций:
//List<String> transactions = new ArrayList<>(Arrays.asList(
//    "Alice:150", "Bob:200", "Alice:75", "Charlie:300",
//    "Bob:150", "Alice:200", "Charlie:100"
//));
//
//Напиши код который:
//Посчитает общую сумму транзакций для каждого человека
//Выведет имя человека с наибольшей суммой
public class Task6 {
    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>(Arrays.asList(
                "Alice:150", "Bob:200", "Alice:75", "Charlie:300",
                "Bob:150", "Alice:200", "Charlie:100"));
        Map<String, Integer> result = new HashMap<>();

        for (String s : transactions) {
            String[] transaction = s.split(":");
            String name = transaction[0];
            int money = Integer.parseInt(transaction[1]);
            result.put(name, result.getOrDefault(name, 0) + money);
        }
        System.out.println(result);

        int maxMoney = 0;
        String name = "";
        for (Map.Entry<String, Integer> entry : result.entrySet()) {
            if (entry.getValue() > maxMoney){
                maxMoney = entry.getValue();
                name = entry.getKey();
            }
        }
        System.out.println(name);
    }
}
