
public class recursionPattern3 {
    static void printSpace(int space) {
        if (space == 0) {
            return;
        }
        System.out.print(" ");
        printSpace(space - 1);

    }

    static void printStar(int col, int k) {
        if (col == 0) {

            return;

        }

        k--;
        System.out.print(k);
        printStar(col - 1, k);

    }

    static void printPattern(int row, int col, int k) {

        if (row == 0) {
            return;

        }
        printSpace(5 - col);
        printStar(col, k);
        System.out.println();
        printPattern(row - 1, col - 1, k - 1);

    }

    public static void main(String[] args) {
        printPattern(5, 5, 6);
    }
}
