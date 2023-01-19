public class steps {
    static int step(int n) {
        if (n == 1 || n == 0) {
            return 1;

        } else if (n == 2) {
            return 2;
        } else {
            return step(n - 2) + step(n - 1);
        }

    }

    public static void main(String[] args) {

        System.out.println(step(4));
    }
}