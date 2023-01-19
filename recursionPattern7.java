public class recursionPattern7 {

    static void printStar(int col, int k) {
        if (col == 0) {
            return;
        }
        k++;
        System.out.print((char) k);
        printStar(col - 1, k);
    }

    static void printPattern(int row, int col) {
        int k = 96;
        if (row == 0) {
            return;

        }
        printStar(col, k);
        System.out.println();
        printPattern(row - 1, col - 1);

    }

    public static void main(String[] args) {
        printPattern(5, 5);
    }

}
