import java.util.HashMap;

public class frequencyCount {

    public static void main(String[] args) {
        String str = "ram sharma";

        // int arr[]={3,2};
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            // get one character at a time
            char singleChar = str.charAt(i);
            // check if that character is space then continue
            if (singleChar == ' ') {
                continue;
            }
            // check if that character is available in map
            if (map.get(singleChar) == null) {
                // if not available then put that character as a key
                // and 1 as a valuem: ('r'=1)
                map.put(singleChar, 1);
            }

            else {
                // get previous count of that character
                int prevCount = map.get(singleChar);
                map.put(singleChar, prevCount + 1);
            }
        }
        System.out.println(map);

    }

}
