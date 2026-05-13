package ai_tasks.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

//Реализуй простой стек истории браузера.
//Напиши код который:
//
//Добавит страницы: "google.com", "youtube.com", "github.com", "stackoverflow.com"
//Выведет текущую страницу (не удаляя)
//Нажмёт "назад" 2 раза — каждый раз выводя на какую страницу вернулись
public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> history = new LinkedList<>();
        history.push("google.com");
        history.push("youtube.com");
        history.push("github.com");
        history.push("stackoverflow.com");
        System.out.println("Текщая страница - " + history.peek());
        int click = 2;
        for (int i = 0; i < click; i++){
            history.pop();
            System.out.println("Текщая страница - " + history.peek());
        }
    }
}
