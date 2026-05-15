package ai_tasks.treeMap;

import java.util.*;

//List<String> students = new ArrayList<>(Arrays.asList(
//    "Charlie:85", "Alice:92", "Bob:78", "Diana:92", "Eve:65"));
//Напиши код который используя уникальные методы TreeMap:
//Выведет первого и последнего студента по алфавиту
//Выведет студентов чьи имена идут до "Diana" (не включая)
//Выведет студентов чьи имена идут с "Charlie" и после
public class Task2 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>(Arrays.asList(
                "Charlie:85", "Alice:92", "Bob:78", "Diana:92", "Eve:65"));
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        for (String s: students){
            String[] sArr = s.split(":");
            treeMap.put(sArr[0], Integer.parseInt(sArr[1]));
        }
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.headMap("Diana"));
        System.out.println(treeMap.tailMap("Charlie"));
    }
}
