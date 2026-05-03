package cata_7;

import static java.util.Arrays.stream;

//In this little assignment you are given a string of space separated numbers,
//and have to return the highest and lowest number.
//
//Examples
//highAndLow("1 2 3 4 5") // return "5 1"
//highAndLow("1 2 -3 4 5") // return "5 -3"
//highAndLow("1 9 3 4 -5") // return "9 -5"
//Notes
//All numbers are valid Int32, no need to validate them.
//There will always be at least one number in the input string.
//Output string must be two numbers separated by a single space, and highest number is first.
public class HighestAndLowest {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 3 4 5"));
        System.out.println(highAndLow("1 2 -3 4 5"));
        System.out.println(anotherHighAndLow("1 9 3 4 -5"));
    }

    public static String highAndLow(String numbers) {
        String[] numArr = numbers.split(" ");
        int highestNum = Integer.MIN_VALUE;
        int lowestNum = Integer.MAX_VALUE;
        for (String s : numArr) {
            int num = Integer.parseInt(s);
            if (num > highestNum) highestNum = num;
            if (num < lowestNum) lowestNum = num;
        }
        return highestNum + " " + lowestNum;
    }

    static String anotherHighAndLow(String numbers) {
        var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return stats.getMax() + " " + stats.getMin();
    }
}
