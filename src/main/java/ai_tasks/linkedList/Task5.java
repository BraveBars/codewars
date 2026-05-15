package ai_tasks.linkedList;

import java.util.LinkedList;

//Напиши код который проверяет правильность расстановки скобок в строке.
//String s1 = "({[]})";  // true
//String s2 = "({[}])";  // false
//String s3 = "((("  ;   // false
//String s4 = "(()a";    // false
//Правило: каждая открывающая скобка должна закрываться правильной закрывающей и в правильном порядке.
public class Task5 {
    public static void main(String[] args) {
        String s1 = "({[]})";
        String s2 = "({[}])";
        String s3 = "(((";
        String s4 = "(()a";
        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
        System.out.println(isValid(s3));
        System.out.println(isValid(s4));
    }

    static boolean isValid(String string) {
        LinkedList<Character> characterLinkedList = new LinkedList<>();
        for (char ch : string.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                characterLinkedList.push(ch);
            } else if (ch == ']' || ch == '}' || ch == ')') {
                if (characterLinkedList.isEmpty()) {
                    return false;
                }
                char top = characterLinkedList.pop();
                if ((ch == ']' && top != '[') ||
                        (ch == '}' && top != '{') ||
                        (ch == ')' && top != '(')) {
                    return false;
                }
            }
        }
        return characterLinkedList.isEmpty();
    }
}
