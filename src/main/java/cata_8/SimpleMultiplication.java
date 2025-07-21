//This kata is about multiplying a given number by eight if it is an even number and by nine otherwise.
package cata_8;

public class SimpleMultiplication {
    public static void main(String[] args) {
        System.out.println(simpleMultiplication(16));
        System.out.println(simpleMultiplication(27));
        System.out.println(simpleMultiplication2(16));
        System.out.println(simpleMultiplication2(27));
    }

    public static int simpleMultiplication(int n) {
        return n % 2 == 0 ? n * 8 : n * 9;
    }

    public static int simpleMultiplication2(int n) {
        if (n % 2 == 0){
            return n * 8;
        } else {
            return n * 9;
        }
    }
}
