//Given an array of integers, return a new array with each value doubled.
//
//For example:
//
//        [1, 2, 3] --> [2, 4, 6]
package cata_8;

import java.util.Arrays;

public class Maps {
    public static void main(String[] args) {
        int[] as = {1, 2, 3};
        System.out.println(Arrays.toString(map(as)));
        System.out.println(Arrays.toString(mapStream(as)));
    }

    public static int[] map(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * 2;
        }
        return result;
    }

    public static int[] mapStream(int[] arr) {
        return Arrays.stream(arr)
                .map(x -> x * 2)
                .toArray();
    }
}