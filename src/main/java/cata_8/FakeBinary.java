//Given a string of digits, you should replace any digit below 5 with '0'
//and any digit 5 and above with '1'. Return the resulting string.
//
//Note: input will never be an empty string
package cata_8;

public class FakeBinary {
    public static void main(String[] args) {
        System.out.println(fakeBin("45385593107843568"));
        System.out.println(fakeBin2("45385593107843568"));
        System.out.println(fakeBinStream("45385593107843568"));
    }

    public static String fakeBin(String numberString) {
        StringBuilder result = new StringBuilder();
        for (char c : numberString.toCharArray()){
            if (c < '5'){
                result.append('0');
            } else {
                result.append('1');
            }
        }
        return result.toString();
    }

    public static String fakeBin2(String numberString) {
        return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

    public static String fakeBinStream(String numberString) {
        return numberString.chars()
                .mapToObj(c -> c < '5' ? '0' : '1')
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
