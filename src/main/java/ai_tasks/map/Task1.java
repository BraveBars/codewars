package ai_tasks.map;
//У тебя есть строка:
//String text = "hello world";
//Напиши код который подсчитает сколько раз встречается каждая буква и выведет результат. Пробелы игнорируй.
//Пример вывода:
//h=1, e=1, l=3, o=2, w=1, r=1, d=1
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        String text = "hello world";
        Map<Character, Integer> counter = new HashMap<>();
        for (Character character: text.replace(" ", "").toCharArray()){
            counter.put(character, counter.getOrDefault(character, 0) + 1);
        }
        System.out.println(counter);
    }
}
