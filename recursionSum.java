public class recursionSum {

    static int Sum(int n, int r) {
        if (n == 0) {
            return r;
        }
        r = n / 10;

        Sum(n / 10, r++);
        return r;
    }

    public static void main(String[] args) {
        int c = Sum(123465, 0);
        System.out.println(c);

    }
}
