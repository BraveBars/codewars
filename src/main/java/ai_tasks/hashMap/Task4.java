package ai_tasks.hashMap;

import java.util.*;

//У тебя есть список сотрудников и их отделов:
//List<String> employees = new ArrayList<>(Arrays.asList(
//    "Alice:HR", "Bob:IT", "Charlie:HR",
//    "Diana:IT", "Eve:Finance", "Frank:IT"
//));
//Напиши код который сгруппирует сотрудников по отделам и выведет:
//HR: [Alice, Charlie]
//IT: [Bob, Diana, Frank]
//Finance: [Eve]
public class Task4 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>(Arrays.asList(
                "Alice:HR", "Bob:IT", "Charlie:HR",
                "Diana:IT", "Eve:Finance", "Frank:IT"));
        Map<String, List<String>> result = new HashMap<>();
        for (String s: employees){
            String[] emp = s.split(":");
            String name = emp[0];
            String department = emp[1];
//            if (!result.containsKey(department)){
//                result.put(emp[1], new ArrayList<>());
//            }
//            result.get(department).add(name);
            result.computeIfAbsent(department, k -> new ArrayList<>()).add(name);
        }
        System.out.println(result);
    }
}
