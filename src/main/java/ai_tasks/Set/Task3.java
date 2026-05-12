package ai_tasks.Set;

import java.util.HashSet;
import java.util.Set;

//У тебя есть два массива:
//int[] arr1 = {1, 2, 3, 4, 5};
//int[] arr2 = {4, 5, 6, 7, 8};
//
//Напиши код который выведет:
//Элементы которые есть в обоих массивах
//Элементы которые есть в arr1 но нет в arr2
public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.println(elementsCrossing(arr1, arr2));
        System.out.println(elementsInFirstArr(arr1, arr2));
    }

    public static Set<Integer> arrToSet(int[] arr){
        Set <Integer> set1 = new HashSet<>();
        for (int i: arr){
            set1.add(i);
        }
        return set1;
    }

    public static Set<Integer> elementsCrossing(int[] arr1, int[] arr2){
        Set <Integer> set1 = arrToSet(arr1);
        Set <Integer> set2 = arrToSet(arr2);
        set1.retainAll(set2);
        return set1;
    }

    public static Set<Integer> elementsInFirstArr(int[] arr1, int[] arr2){
        Set <Integer> set1 = arrToSet(arr1);
        set1.removeAll(arrToSet(arr2));
        return set1;
    }
}
