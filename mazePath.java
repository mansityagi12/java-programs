
import java.util.ArrayList;

public class mazePath {
    static ArrayList<String> path(int row, int col, int currentRow, int currentCol) {
        if (currentRow == row && currentCol == col) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        if (currentRow > row || currentCol > col) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        ArrayList<String> result = new ArrayList<>();

        ArrayList<String> horizontal = path(row, col, currentRow, currentCol + 1);

        for (String str : horizontal) {
            result.add("H" + str);
        }
        ArrayList<String> vertical = path(row, col, currentRow + 1, currentCol);

        for (String str : vertical) {
            result.add("V" + str);
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> res = path(3, 3, 1, 1);
        System.out.println(res);

    }
}
