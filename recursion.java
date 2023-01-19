public class recursion {

    static int countDigit(int num, int count) {
        if (num == 0) {
            return count;
        }
        // small problem
        num = num / 10;
        count++;
        return countDigit(num, count);
    }

    public static void main(String[] args) {
        int c = countDigit(12345, 0);
        System.out.println(c);
    }

}
