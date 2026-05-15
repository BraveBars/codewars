package ai_tasks.linkedList;

import java.util.LinkedList;

//Напиши код используя два объекта:
//LinkedList<String> history = new LinkedList<>(); // стек истории
//String text = "";                                // текущий текст
//
//Логика:
//При добавлении слова — сохранить текущий text в history, потом обновить text
//При отмене (Ctrl+Z) — достать последнее состояние из history и вернуть в text
//
//Выполни:
//Добавь слова "Hello", "World", "Java"
//Выведи текущий текст
//Отмени 2 раза
//Выведи текст после отмены
public class Task4 {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();
        String text = "";
        String[] words = {"Hello ", "World ", "Java"};
        for (String s : words) {
            text += s;
            history.add(text);
        }
        System.out.println(history);
        int ctrlz = 2;
        for (int i = 0; i < ctrlz; i++) {
            history.removeLast();
            text = history.getLast();
        }
        System.out.println(text);
    }
}
