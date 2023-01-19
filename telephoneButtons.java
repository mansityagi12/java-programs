import java.util.ArrayList;

public class telephoneButtons {

    static String keypad[] = { ".", "@#$", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    static ArrayList<String> keypad(String number) {
        if (number.length() == 0) {
            ArrayList<String> list = new ArrayList<String>();
            list.add("");
            return list;
        }

        char fnum = number.charAt(0);
        String remString = number.substring(1);
        int index = fnum - '0';
        String key = keypad[index];
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < key.length(); i++) {
            ArrayList<String> temp = keypad(remString);
            for (String str : temp) {
                result.add(key.charAt(i) + str);

            }
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> res = keypad("23");
        System.out.println(res);

    }

}
