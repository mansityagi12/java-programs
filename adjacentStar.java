public class adjacentStar {
    static String output = "";

    static void adjacent(String str, int i) {
        output = output + str.charAt(i);

        if (i == str.length() - 1) {
            return;
        }
        if (str.charAt(i) == str.charAt(i + 1)) {
            output += "*";

        }
        adjacent(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "abbabaab";
        adjacent(str, 0);
        System.out.println(output);

    }

}
