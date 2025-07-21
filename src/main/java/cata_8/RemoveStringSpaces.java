//Write a function that removes the spaces from the string, then return the resultant string.
//
//Examples (Input -> Output):
//
//        "8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
//        "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
//        "8aaaaa dddd r     " -> "8aaaaaddddr"
package cata_8;

public class RemoveStringSpaces {
    public static void main(String[] args) {
        System.out.println(noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpaceEasy("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(noSpaceStream("8 j 8   mBliB8g  imjB8B8  jl  B"));
    }

    public static String noSpace(final String x) {
        StringBuilder result = new StringBuilder();
        for (char c : x.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String noSpaceEasy(String x) {
        return x.replace(" ", "");
    }

    public static String noSpaceStream(String x) {
        return x.chars()
                .filter(c -> c != ' ')
                .collect(StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }
}
