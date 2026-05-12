package ai_tasks.Set;

import java.util.*;

//У тебя есть строка:
//String s = "hello world";
//Напиши код который проверит содержит ли строка только уникальные символы (без учёта пробелов).
//Результат: true если все символы уникальны, false если есть повторы.
public class Task2 {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(isUnique(s));
    }

    public static boolean isUnique(String s){
        s = s.replace(" ", "");
        char[] sArr = s.toCharArray();
        Set <Character> sSet = new HashSet<>();
        for (char ch: sArr){
            if (!sSet.add(ch)){
                return false;
            }
        }
        return true;
    }
}
