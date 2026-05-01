package cata_8;

import java.util.List;

//Create a function that takes an integer as an argument and
//returns "Even" for even numbers or "Odd" for odd numbers.
public class EvenOrOdd {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(0,1,2,3,4,5,6,7,8,9);
        for (Integer i: numbers){
            System.out.println(i + " is " + evenOrOdd(i));
        }
    }

    public static String evenOrOdd(int num){
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
