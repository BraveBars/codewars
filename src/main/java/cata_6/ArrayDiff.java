package cata_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Implement a function that computes the difference between two lists.
//The function should remove all occurrences of elements from the first list (a) that are
//present in the second list (b). The order of elements in the first list should be preserved in the result.
//Examples
//If a = [1, 2] and b = [1], the result should be [2].
//If a = [1, 2, 2, 2, 3] and b = [2], the result should be [1, 3]
public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{2})));
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();

        for (int i : a) {
            aList.add(i);
        }
        for (int i : b) {
            bList.add(i);
        }

        aList.removeAll(bList);

        int[] result = new int[aList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = aList.get(i);
        }
        return result;
    }
}
