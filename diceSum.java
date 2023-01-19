import java.util.ArrayList;

public class diceSum {
    static ArrayList<String> diceCount(int source, int target) {
        if (source == target) {
            ArrayList<String> empty = new ArrayList<>();
            empty.add("");
            return empty;
        }
        if (source > target) {
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        ArrayList<String> result = new ArrayList<>();

        for (int dice = 1; dice <= 6; dice++) {
            int current = source + dice;
            ArrayList<String> list = diceCount(current, target);
            for (String str : list) {
                result.add(str + dice);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> res = diceCount(0, 10);
        System.out.println(res);
    }

}
