package ai_tasks.linkedList;

import java.util.Arrays;
import java.util.LinkedList;

//Напиши код который разворачивает список без использования Collections.reverse().
//LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
// результат: [5, 4, 3, 2, 1]
public class Task6 {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        LinkedList<Integer> reverse = new LinkedList<>();
        while (!numbers.isEmpty()) {
            reverse.push(numbers.removeFirst());
        }
        System.out.println(reverse);
    }
}
