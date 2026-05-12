package ai_tasks.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//У тебя есть строка:
//String s = "abcdeafbcg";
//Найди первый символ который не повторяется в строке и выведи его. Если таких нет — выведи -.
//Ожидаемый результат: d (первый символ встречающийся только один раз)
public class Task5 {
    public static void main(String[] args) {
        String s = "abcdeafbcg";
        Set<Character> characterSet = new LinkedHashSet<>();
        Set<Character> characterSet2 = new HashSet<>();
        for (char ch: s.toCharArray()){
            if (!characterSet.add(ch)){
                characterSet2.add(ch);
            }
        }
        characterSet.removeAll(characterSet2);
        System.out.println(characterSet.isEmpty() ? '-' : characterSet.iterator().next());
    }
}
