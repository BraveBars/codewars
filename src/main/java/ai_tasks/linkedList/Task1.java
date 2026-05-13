package ai_tasks.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

//У тебя есть очередь задач. Напиши код который:
//
//Добавит задачи: "Task1", "Task2", "Task3", "Task4", "Task5"
//Обработает задачи по порядку (первый вошёл — первый вышел) выводя каждую на экран
//Добавит срочную задачу "Urgent" в начало очереди и обработает всё заново
public class Task1 {
    public static void main(String[] args) {
        String[] tasks = {"Task1", "Task2", "Task3", "Task4", "Task5"};
        boolean urgentFlag = true;
        LinkedList<String> linkedTasks = new LinkedList<>(Arrays.asList(tasks));
        if (urgentFlag){
            linkedTasks.addFirst("Urgent");
        }
        while (!linkedTasks.isEmpty()){
            System.out.println(linkedTasks.poll());
        }
    }
}
