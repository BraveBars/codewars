package ai_tasks.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

//У тебя есть список чисел:
//LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//Напиши код который:
//
//Удалит все чётные числа из начала списка пока первый элемент чётный
//Удалит все чётные числа с конца списка пока последний элемент чётный
//Выведет результат
public class Task3 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(2, 4, 1, 3, 5, 6, 8));
        while (!numbers.isEmpty() && numbers.peekFirst() % 2 == 0) {
            numbers.removeFirst();
        }
        while (!numbers.isEmpty() && numbers.peekLast() % 2 == 0) {
            numbers.removeLast();
        }
        System.out.println(numbers);
    }
}

